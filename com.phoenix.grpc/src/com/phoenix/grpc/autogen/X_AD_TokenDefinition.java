/******************************************************************************
 * Product: iDempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2012 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package com.phoenix.grpc.autogen;

import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.model.*;

/** Generated Model for AD_TokenDefinition
 *  @author iDempiere (generated) 
 *  @version Release 7.1 - $Id$ */
public class X_AD_TokenDefinition extends PO implements I_AD_TokenDefinition, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20200611L;

    /** Standard Constructor */
    public X_AD_TokenDefinition (Properties ctx, int AD_TokenDefinition_ID, String trxName)
    {
      super (ctx, AD_TokenDefinition_ID, trxName);
      /** if (AD_TokenDefinition_ID == 0)
        {
			setAD_TokenDefinition_ID (0);
			setClassname (null);
			setName (null);
			setTokenType (null);
// URL
			setValue (null);
        } */
    }

    /** Load Constructor */
    public X_AD_TokenDefinition (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 7 - System - Client - Org 
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuffer sb = new StringBuffer ("X_AD_TokenDefinition[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set AD_TokenDefinition.
		@param AD_TokenDefinition_ID AD_TokenDefinition	  */
	public void setAD_TokenDefinition_ID (int AD_TokenDefinition_ID)
	{
		if (AD_TokenDefinition_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_AD_TokenDefinition_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_AD_TokenDefinition_ID, Integer.valueOf(AD_TokenDefinition_ID));
	}

	/** Get AD_TokenDefinition.
		@return AD_TokenDefinition	  */
	public int getAD_TokenDefinition_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_TokenDefinition_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Classname.
		@param Classname 
		Java Classname
	  */
	public void setClassname (String Classname)
	{
		set_Value (COLUMNNAME_Classname, Classname);
	}

	/** Get Classname.
		@return Java Classname
	  */
	public String getClassname () 
	{
		return (String)get_Value(COLUMNNAME_Classname);
	}

	/** Set Description.
		@param Description 
		Optional short description of the record
	  */
	public void setDescription (String Description)
	{
		set_Value (COLUMNNAME_Description, Description);
	}

	/** Get Description.
		@return Optional short description of the record
	  */
	public String getDescription () 
	{
		return (String)get_Value(COLUMNNAME_Description);
	}

	/** Set Name.
		@param Name 
		Alphanumeric identifier of the entity
	  */
	public void setName (String Name)
	{
		set_Value (COLUMNNAME_Name, Name);
	}

	/** Get Name.
		@return Alphanumeric identifier of the entity
	  */
	public String getName () 
	{
		return (String)get_Value(COLUMNNAME_Name);
	}

	/** TokenType AD_Reference_ID=54071 */
	public static final int TOKENTYPE_AD_Reference_ID=54071;
	/** SMS = SMS */
	public static final String TOKENTYPE_SMS = "SMS";
	/** URL (Token Used as URL) = URL */
	public static final String TOKENTYPE_URLTokenUsedAsURL = "URL";
	/** EMA (Email message) = EMA */
	public static final String TOKENTYPE_EMAEmailMessage = "EMA";
	/** Set TokenType.
		@param TokenType 
		Wiki Token Type
	  */
	public void setTokenType (String TokenType)
	{

		set_Value (COLUMNNAME_TokenType, TokenType);
	}

	/** Get TokenType.
		@return Wiki Token Type
	  */
	public String getTokenType () 
	{
		return (String)get_Value(COLUMNNAME_TokenType);
	}

	/** Set uuid.
		@param uuid uuid	  */
	public void setuuid (String uuid)
	{
		set_Value (COLUMNNAME_uuid, uuid);
	}

	/** Get uuid.
		@return uuid	  */
	public String getuuid () 
	{
		return (String)get_Value(COLUMNNAME_uuid);
	}

	/** Set Search Key.
		@param Value 
		Search key for the record in the format required - must be unique
	  */
	public void setValue (String Value)
	{
		set_Value (COLUMNNAME_Value, Value);
	}

	/** Get Search Key.
		@return Search key for the record in the format required - must be unique
	  */
	public String getValue () 
	{
		return (String)get_Value(COLUMNNAME_Value);
	}
}