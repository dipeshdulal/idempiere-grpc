package org.spin.grpc.util.impl;

import com.phoenix.grpc.models.MADToken;

/**
 * @author Raul Muñoz, rMunoz@erpcya.com, ERPCyA http://www.erpcya.com
 *		<a href="https://github.com/adempiere/adempiere/issues/1769">
 * 		@see FR [ 1769 ] Add option to restore the password from the login</a>
 *
 */
interface ITokenGenerator {

	/**
	 * Generate Token
	 * @param tokenType
	 * @param userId
	 * @return
	 */
	public  String generateToken(String tokenType, int userId);
	
	/**
	 * Validate Token
	 * @param token
	 * @param userId
	 * @return
	 */
	public boolean validateToken(String token, int userId);

	/**
	 * Get Token Value
	 * @return
	 */
	public  String getTokenValue();
	
	/**
	 * Get PO Token
	 * @return
	 */
	public  MADToken getToken();
}