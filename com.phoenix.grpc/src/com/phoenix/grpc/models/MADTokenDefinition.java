package com.phoenix.grpc.models;

import java.sql.ResultSet;
import java.util.List;
import java.util.Properties;
import java.util.stream.Collectors;

import org.compiere.model.Query;
import org.compiere.util.CCache;
import org.compiere.util.Env;

import com.phoenix.grpc.autogen.X_AD_TokenDefinition;

public class MADTokenDefinition extends X_AD_TokenDefinition {


	private static final long serialVersionUID = -1171525387615789574L;

	/** Static Cache */
	private static CCache<Integer, MADTokenDefinition> definitionCacheIds = new CCache<Integer, MADTokenDefinition>(Table_Name, 30);
	/** Static Cache */
	private static CCache<String, MADTokenDefinition> definitionCacheValues = new CCache<String, MADTokenDefinition>(Table_Name, 30);

	
	public MADTokenDefinition(Properties ctx, int AD_TokenDefinition_ID, String trxName) {
		
		super(ctx, AD_TokenDefinition_ID, trxName);
	}

	public MADTokenDefinition(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
	}
	
	/**
	 * Get/Load Activity [CACHED]
	 * @param ctx context
	 * @param definitionId
	 * @param trxName
	 * @return activity or null
	 */
	public static MADTokenDefinition getById(Properties ctx, int definitionId, String trxName) {
		if (definitionId <= 0)
			return null;

		MADTokenDefinition definition = definitionCacheIds.get(definitionId);
		if (definition != null && definition.get_ID() > 0)
			return definition;

		definition = new Query(ctx , Table_Name , COLUMNNAME_AD_TokenDefinition_ID + "=?" , trxName)
				.setClient_ID()
				.setParameters(definitionId)
				.first();
		if (definition != null && definition.get_ID() > 0) {
			int clientId = Env.getAD_Client_ID(ctx);
			String key = clientId + "#" + definition.getValue();
			definitionCacheValues.put(key, definition);
			definitionCacheIds.put(definition.get_ID(), definition);
		}
		return definition;
	}

	/**
	 * get Activity By Value [CACHED]
	 * @param ctx
	 * @param tokenType
	 * @param trxName
	 * @return
	 */
	public static MADTokenDefinition getByTokenType(Properties ctx, String tokenType, String trxName) {
		if (tokenType == null)
			return null;
		if (definitionCacheValues.size() == 0) {
			getAll(ctx, true, trxName);
		}

		int clientId = Env.getAD_Client_ID(ctx);
		String key = clientId + "#" + tokenType;
		MADTokenDefinition definition = definitionCacheValues.get(key);
		if (definition != null && definition.get_ID() > 0 )
			return definition;

		definition =  new Query(ctx, Table_Name , COLUMNNAME_TokenType +  "=? AND AD_Client_ID IN(0, ?)", trxName)
				.setParameters(tokenType, clientId)
				.setOrderBy(COLUMNNAME_AD_Client_ID + " DESC")
				.first();

		if (definition != null && definition.get_ID() > 0) {
			definitionCacheValues.put(key, definition);
			definitionCacheIds.put(definition.get_ID() , definition);
		}
		return definition;
	}

	/**
	 * Get All Activity
	 * @param ctx
	 * @param resetCache
	 * @param trxName
	 * @return
	 */
	public static List<MADTokenDefinition> getAll(Properties ctx, boolean resetCache, String trxName) {
		List<MADTokenDefinition> definitionList;
		if (resetCache || definitionCacheIds.size() > 0 ) {
			definitionList = new Query(Env.getCtx(), Table_Name, null , trxName)
					.setClient_ID()
					.setOrderBy(COLUMNNAME_Name)
					.list();
			definitionList.stream().forEach(definition -> {
				int clientId = Env.getAD_Client_ID(ctx);
				String key = clientId + "#" + definition.getValue();
				definitionCacheIds.put(definition.getAD_TokenDefinition_ID(), definition);
				definitionCacheValues.put(key, definition);
			});
			return definitionList;
		}
		definitionList = definitionCacheIds.entrySet().stream()
				.map(activity -> activity.getValue())
				.collect(Collectors.toList());
		return  definitionList;
	}

	@Override
	public String toString() {
		return "MADTokenDefinition [getAD_TokenDefinition_ID()=" + getAD_TokenDefinition_ID() + ", getClassname()="
				+ getClassname() + ", getName()=" + getName() + ", getTokenType()=" + getTokenType() + ", getValue()="
				+ getValue() + "]";
	}
	
}
