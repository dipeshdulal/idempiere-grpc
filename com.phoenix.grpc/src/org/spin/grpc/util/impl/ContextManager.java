package org.spin.grpc.util.impl;

import java.sql.Timestamp;
import java.util.Properties;

import org.adempiere.exceptions.AdempiereException;
import org.compiere.model.I_AD_Org;
import org.compiere.model.I_AD_Session;
import org.compiere.model.I_M_Warehouse;
import org.compiere.model.MOrg;
import org.compiere.model.MSession;
import org.compiere.model.MWarehouse;
import org.compiere.model.Query;
import org.compiere.util.CCache;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Language;
import org.compiere.util.Util;

/**
 * Class for handle Context
 * @author Yamel Senih, ysenih@erpya.com , http://www.erpya.com
 */
public class ContextManager {
	
	/**	Session Context	*/
	private static CCache<String, Properties> sessionsContext = new CCache<String, Properties>("Session-gRPC-Service", 30, 0);	//	no time-out
	/**	Language */
	private static CCache<String, String> languageCache = new CCache<String, String>("Language-gRPC-Service", 30, 0);	//	no time-out
	/**	Organization Cache	*/
	private static CCache<String, MOrg> organizationCache = new CCache<String, MOrg>(I_AD_Org.Table_Name + "-gRPC-Service", 30, 0);	//	no time-out
	/**	Warehouse Cache	*/
	private static CCache<String, MWarehouse> warehouseCache = new CCache<String, MWarehouse>(I_M_Warehouse.Table_Name + "-gRPC-Service", 30, 0);	//	no time-out
	
	/**
	 * Get Context without organization and warehouse
	 * @param sessionUuid
	 * @param language
	 * @return
	 */
	public static Properties getContext(String sessionUuid, String language) {
		return getContext(sessionUuid, language, null, null);
	}
	
	/**
	 * Get context from session
	 * @param sessionUuid
	 * @param language
	 * @param organizationUuid
	 * @param warehouseUuid
	 * @return
	 */
	public static Properties getContext(String sessionUuid, String language, String organizationUuid, String warehouseUuid) {
		Properties context = sessionsContext.get(sessionUuid);
		if(context != null) {
			Env.setContext(context, Env.LANGUAGE, getDefaultLanguage(language));
			setDefault(context, Env.getAD_Org_ID(context), organizationUuid, warehouseUuid);
			return context;
		}
		context = Env.getCtx();
//		DB.validateSupportedUUIDFromDB();
		MSession session = new Query(context, I_AD_Session.Table_Name, I_AD_Session.COLUMNNAME_AD_Session_UU + " = ?", null)
				.setParameters(sessionUuid)
				.first();
		if(session == null
				|| session.getAD_Session_ID() <= 0) {
			throw new AdempiereException("@AD_Session_ID@ @NotFound@");
		}
		Env.setContext (context, "#AD_Session_ID", session.getAD_Session_ID());
		Env.setContext(context, "#AD_User_ID", session.getCreatedBy());
		Env.setContext(context, "#AD_Role_ID", session.getAD_Role_ID());
		Env.setContext(context, "#AD_Client_ID", session.getAD_Client_ID());
		setDefault(context, session.getAD_Org_ID(), organizationUuid, warehouseUuid);
		Env.setContext(context, "#Date", new Timestamp(System.currentTimeMillis()));
		Env.setContext(context, Env.LANGUAGE, getDefaultLanguage(language));
		//	Save to Cache
		sessionsContext.put(sessionUuid, context);
		return context;
	}
	
	/**
	 * Set Default warehouse and organization
	 * @param context
	 * @param defaultOrganizationId
	 * @param organizationUuid
	 * @param warehouseUuid
	 */
	private static void setDefault(Properties context, int defaultOrganizationId, String organizationUuid, String warehouseUuid) {
		int organizationId = defaultOrganizationId;
		if(!Util.isEmpty(organizationUuid)) {
			MOrg organization = organizationCache.get(organizationUuid);
			if(organization == null) {
				organization = new Query(context, I_AD_Org.Table_Name, I_AD_Org.COLUMNNAME_AD_Org_UU + " = ?", null)
						.setParameters(organizationUuid)
						.first();
			}
			//	
			if(organization != null) {
				organizationId = organization.getAD_Org_ID();
				organizationCache.put(organizationUuid, organization);
			}
		}
		if(!Util.isEmpty(warehouseUuid)) {
			MWarehouse warehouse = warehouseCache.get(warehouseUuid);
			if(warehouse == null) {
				warehouse = new Query(context, I_M_Warehouse.Table_Name, I_M_Warehouse.COLUMNNAME_M_Warehouse_UU + " = ?", null)
						.setParameters(warehouseUuid)
						.first();
			}
			//	
			if(warehouse != null) {
				warehouseCache.put(warehouseUuid, warehouse);
				Env.setContext(context, "#M_Warehouse_ID", organizationId);
			}
		}
		Env.setContext(context, "#AD_Org_ID", organizationId);
	}
	
	/**
	 * Get Default from language
	 * @param language
	 * @return
	 */
	//	TODO: Change it for a class and reuse
	private static String getDefaultLanguage(String language) {
		String defaultLanguage = language;
		if(Util.isEmpty(language)) {
			language = "en_US";
		}
		//	Using es / en instead es_VE / en_US
		//	get default
		if(language.length() == 2) {
			defaultLanguage = languageCache.get(language);
			if(!Util.isEmpty(defaultLanguage)) {
				return defaultLanguage;
			}
			defaultLanguage = DB.getSQLValueString(null, "SELECT AD_Language "
					+ "FROM AD_Language "
					+ "WHERE LanguageISO = ? "
					+ "AND (IsSystemLanguage = 'Y' OR IsBaseLanguage = 'Y')", language);
		}
		if(Util.isEmpty(defaultLanguage)) {
			defaultLanguage = "en_US";
		}
		//	Default return
		return defaultLanguage;
	}
}