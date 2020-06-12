package org.spin.grpc.util.impl;

import java.security.SecureRandom;
import java.sql.Timestamp;

import org.compiere.model.Query;
import org.compiere.util.Env;

import com.phoenix.grpc.models.MADToken;
/**
 * @author Raul Muñoz, rMunoz@erpya.com, ERPCyA http://www.erpya.com
 * @author Yamel Senih, ySenih@erpya.com, ERPCyA http://www.erpya.com
 *		<a href="https://github.com/adempiere/adempiere/issues/1446">
 * 		@see FR [ 1446 ] Smart Browse for Deposit from cash</a>
 *
 */
public class TokenGenerator implements ITokenGenerator {


    protected static SecureRandom random = new SecureRandom();
    
    private String token;
    private MADToken passReset;
    private Timestamp expireDate;
    
    
    public TokenGenerator() {
    	//	
    }
	
    @Override
	public String generateToken(String tokenType, int userId) {
	    long longToken = Math.abs( random.nextLong());
        String random = Long.toString( longToken, 16);
        token = random + userId;
        expireDate = new Timestamp(System.currentTimeMillis()+5*60*1000);
        passReset = new MADToken(Env.getCtx(), 0, null);
        passReset.setTokenType(tokenType);
        passReset.setexpiredate(expireDate);
        passReset.settokenvalue(token);
        passReset.setAD_User_ID(userId);
        passReset.saveEx();
        return token;
	}

	
	@Override
	public boolean validateToken(String token, int userId) {
		MADToken passReset = new 
				Query(Env.getCtx(), MADToken.Table_Name, MADToken.COLUMNNAME_tokenvalue + " = ? AND " + MADToken.COLUMNNAME_AD_User_ID + " = ?", null)
				.setParameters(token, userId).first();
		Timestamp current = new Timestamp(System.currentTimeMillis());
		if(passReset != null && passReset.getexpiredate().compareTo(current) > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public MADToken getToken() {
		return passReset;
	}
	
	@Override
	public String getTokenValue() {
		return token;
	}
}