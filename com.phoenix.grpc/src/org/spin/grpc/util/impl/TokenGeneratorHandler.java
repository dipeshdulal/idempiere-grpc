package org.spin.grpc.util.impl;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;

import org.compiere.util.CLogger;
import org.compiere.util.Util;

import com.phoenix.grpc.models.MADToken;
import com.phoenix.grpc.models.MADTokenDefinition;

import org.compiere.util.Env;

/**
 * @author Raul Muñoz, rMunoz@erpya.com, ERPCyA http://www.erpcya.com
 * @author Yamel Senih, ySenih@erpya.com, ERPCyA http://www.erpya.com
 *		<a href="https://github.com/adempiere/adempiere/issues/1446">
 * 		@see FR [ 1446 ] Smart Browse for Deposit from cash</a>
 *
 */
public class TokenGeneratorHandler {
	
    private static TokenGeneratorHandler tokenHandler = null;
    
    
    /**	Token Generator	*/
    private Map<String, ITokenGenerator> tokenGeneratorMap = null;
    
	private static final CLogger logger = CLogger.getCLogger(TokenGeneratorHandler.class);
	
	/**
	 * Singleton
	 * @return
	 */
    public static TokenGeneratorHandler getInstance() {
    	if(tokenHandler == null) {
    		tokenHandler = new TokenGeneratorHandler();
    	}
    	return tokenHandler;
    }
    
    /**
     * Instance hash map
     */
    private TokenGeneratorHandler() {
    	tokenGeneratorMap = new HashMap<String, ITokenGenerator>();
    }
    

    /**
     * Get Database
     * @return
     * @throws Exception
     */
    private ITokenGenerator getTokenGenerator(String tokenType) throws Exception  {
        if(!tokenGeneratorMap.containsKey(tokenType)) {
            loadClass(tokenType);
        }
        //  Default return
        return tokenGeneratorMap.get(tokenType);
    }

    /**
     * Generate Token for User ID
     * @param tokenType
     * @param userId
     * @return
     * @throws Exception
     */
    public String generateToken(String tokenType, int userId) throws Exception {
    	return getTokenGenerator(tokenType).generateToken(tokenType, userId);
    }

    /**
     * Validate a Generated Token
     * @param tokenType
     * @param token
     * @param userId
     * @return
     * @throws Exception
     */
    public boolean validateToken(String tokenType, String token, int userId) throws Exception {
    	return getTokenGenerator(tokenType).validateToken(token, userId);
    }
    
    /**
     * Get a Token
     * @param tokenType
     * @return
     * @throws Exception
     */
    public MADToken getToken(String tokenType) throws Exception {
    	return getTokenGenerator(tokenType).getToken();
    }
    /**
     * Get class name for instance
     * @param tokenType
     * @return
     */
    private String getClassname(String tokenType) {
    	MADTokenDefinition definition = MADTokenDefinition.getByTokenType(Env.getCtx(), tokenType, null);
    	if(definition == null) {
    		return null;
    	}
    	//	Default
    	return definition.getClassname();
    }
    
    /**
     * Get Class from device type, used for handler
     * @param tokenType
     * @return
     * @return Class<?>
     */
    private Class<?> getHandlerClass(String tokenType) {
        String className = getClassname(tokenType);
        //	Validate null values
        if(Util.isEmpty(className)) {
            return null;
        }
        try {
            Class<?> clazz = Class.forName(className);
            if(ITokenGenerator.class.isAssignableFrom(clazz)) {
                return clazz;
            }
            //	Make sure that it is a PO class
            Class<?> superClazz = clazz.getSuperclass();
            //	Validate super class
            while (superClazz != null) {
                if (superClazz == ITokenGenerator.class) {
                	logger.log(Level.SEVERE, "Error loading class, Use: " + className);
                    return clazz;
                }
                //	Get Super Class
                superClazz = superClazz.getSuperclass();
            }
        } catch (Exception e) {
        	logger.warning("Loading class Error"+ e.getMessage());
        }
        //
        logger.log(Level.SEVERE,"Not found Class: " + className);
        return null;
    }	//	getHandlerClass

    /**
     * Load class for export
     * @param tokenType
     * @throws Exception
     */
    private void loadClass(String tokenType) throws Exception {
        //	Load it
        //	Get class from parent
        Class<?> clazz = getHandlerClass(tokenType);
        ITokenGenerator generator = null;
        //	Not yet implemented
        if (clazz == null) {
            logger.log(Level.SEVERE, "Class not found, Using Standard Class");
            generator = null;
            throw new Exception("Class for connection not found");
        }
        //
        Constructor<?> constructor = clazz.getDeclaredConstructor();
        //	new instance
        generator = (ITokenGenerator) constructor.newInstance();
        tokenGeneratorMap.put(tokenType, generator);
    }
}