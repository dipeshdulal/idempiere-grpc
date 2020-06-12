package org.spin.grpc.util.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.adempiere.exceptions.AdempiereException;
//import org.adempiere.pipo.IDFinder;
import org.compiere.model.I_AD_Element;
import org.compiere.model.MClientInfo;
import org.compiere.model.PO;
import org.compiere.model.Query;
import org.compiere.util.Env;
import org.compiere.util.Util;
//import org.spin.model.MADAttachmentReference;
//import org.spin.util.AttachmentUtil;

/**
 * Class for handle records utils values
 * @author Yamel Senih, ysenih@erpya.com , http://www.erpya.com
 */
public class RecordUtil {
	/**	Page Size	*/
	public static final int PAGE_SIZE = 50;
	
	/**
	 * Get Page Number
	 * @param sessionUuid
	 * @param pageToken
	 * @return
	 */
	public static int getPageNumber(String sessionUuid, String pageToken) {
		int page = 0;
		String pagePrefix = getPagePrefix(sessionUuid);
		if(!Util.isEmpty(pageToken)) {
			if(pageToken.startsWith(pagePrefix)) {
				try {
					page = Integer.parseInt(pageToken.replace(pagePrefix, ""));
				} catch (Exception e) {
					//	
				}
			}
		}
		//	
		return page;
	}
	
	/**
	 * Get Page Prefix
	 * @param sessionUuid
	 * @return
	 */
	public static String getPagePrefix(String sessionUuid) {
		return sessionUuid + "-";
	}
	
	/**
	 * get Entity from Table and (UUID / Record ID)
	 * @param context
	 * @param tableName
	 * @param uuid
	 * @param recordId
	 * @return
	 */
	public static PO getEntity(Properties context, String tableName, String uuid, int recordId) {
		//	Validate ID
		if(recordId == 0
				&& Util.isEmpty(uuid)) {
			throw new AdempiereException("@Record_ID@ @NotFound@");
		}
		
		if(Util.isEmpty(tableName)) {
			throw new AdempiereException("@AD_Table_ID@ @NotFound@");
		}
		StringBuffer whereClause = new StringBuffer();
		List<Object> params = new ArrayList<>();
		if(!Util.isEmpty(uuid)) {
			whereClause.append(I_AD_Element.COLUMNNAME_AD_Element_UU + " = ?");
			params.add(uuid);
		} else if(recordId > 0) {
			whereClause.append(tableName + "_ID = ?");
			params.add(recordId);
		} else {
			throw new AdempiereException("@Record_ID@ @NotFound@");
		}
		//	Default
		return new Query(context, tableName, whereClause.toString(), null)
				.setParameters(params)
				.first();
	}
	
	/**
	 * Get ID for record from table name and uuid
	 * @param tableName
	 * @param uuid
	 * @return
	 */
//	public static int getIdFromUuid(String tableName, String uuid) {
//		if(Util.isEmpty(tableName) || Util.isEmpty(uuid)) {
//			return -1;
//		}
//		//	Get
//		return IDFinder.getIdFromUUID(Env.getCtx(), tableName, uuid, Env.getAD_Client_ID(Env.getCtx()), null);
//	}
	
	/**
	 * Get UUID from record id
	 * @param tableName
	 * @param id
	 * @return
	 */
//	public static String getUuidFromId(String tableName, int id) {
//		if(Util.isEmpty(tableName) || id <= 0) {
//			return null;
//		}
//		//	Get
//		return IDFinder.getUUIDFromId(tableName, id, Env.getAD_Client_ID(Env.getCtx()), null);
//	}
	
	/**
	 * Get resource UUID from image id
	 * @param imageId
	 * @return
	 */
//	public static String getResourceUuidFromImageId(int imageId) {
//		MADAttachmentReference reference = getResourceFromImageId(imageId);
//		if(reference == null) {
//			return null;
//		}
//		//	Return uuid
//		return reference.getUUID();
//	}
	
	/**
	 * Get Attachment reference from image ID
	 * @param imageId
	 * @return
	 */
//	public static MADAttachmentReference getResourceFromImageId(int imageId) {
//		if(!AttachmentUtil.getInstance().isValidForClient(Env.getAD_Client_ID(Env.getCtx()))) {
//			return null;
//		}
//		//	
//		return MADAttachmentReference.getByImageId(Env.getCtx(), MClientInfo.get(Env.getCtx(), Env.getAD_Client_ID(Env.getCtx())).getFileHandler_ID(), imageId, null);
//	}
}