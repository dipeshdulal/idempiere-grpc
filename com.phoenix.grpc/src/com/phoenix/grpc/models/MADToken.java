package com.phoenix.grpc.models;

import java.sql.ResultSet;
import java.util.Properties;

import org.adempiere.exceptions.AdempiereException;

import com.phoenix.grpc.autogen.X_AD_Token;

public class MADToken extends X_AD_Token {


	private static final long serialVersionUID = -1171525387615789574L;

	public MADToken(Properties ctx, int AD_Token_ID, String trxName) {
		
		super(ctx, AD_Token_ID, trxName);
	}

	public MADToken(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
	}
	
	/**
	 * Set parent reference
	 * @param tokenType
	 */
	public void setTokenType(String tokenType) {
		MADTokenDefinition definition = MADTokenDefinition.getByTokenType(getCtx(), tokenType, get_TrxName());
		if(definition == null) {
			throw new AdempiereException("@TokenType@ " + tokenType + " @NotFound@");
		}
		//	Set
		setAD_TokenDefinition_ID(definition.getAD_TokenDefinition_ID());
	}
}
