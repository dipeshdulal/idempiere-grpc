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
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.model.*;

/** Generated Model for AD_Token
 *  @author iDempiere (generated) 
 *  @version Release 7.1 - $Id$ */
public class X_AD_Token extends PO implements I_AD_Token, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20200611L;

    /** Standard Constructor */
    public X_AD_Token (Properties ctx, int AD_Token_ID, String trxName)
    {
      super (ctx, AD_Token_ID, trxName);
      /** if (AD_Token_ID == 0)
        {
			setAD_TokenDefinition_ID (0);
			setAD_Token_ID (0);
			setexpiredate (new Timestamp( System.currentTimeMillis() ));
        } */
    }

    /** Load Constructor */
    public X_AD_Token (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_AD_Token[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public I_AD_TokenDefinition getAD_TokenDefinition() throws RuntimeException
    {
		return (I_AD_TokenDefinition)MTable.get(getCtx(), I_AD_TokenDefinition.Table_Name)
			.getPO(getAD_TokenDefinition_ID(), get_TrxName());	}

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

	/** Set AD_Token.
		@param AD_Token_ID AD_Token	  */
	public void setAD_Token_ID (int AD_Token_ID)
	{
		if (AD_Token_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_AD_Token_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_AD_Token_ID, Integer.valueOf(AD_Token_ID));
	}

	/** Get AD_Token.
		@return AD_Token	  */
	public int getAD_Token_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Token_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_AD_User getAD_User() throws RuntimeException
    {
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_Name)
			.getPO(getAD_User_ID(), get_TrxName());	}

	/** Set User/Contact.
		@param AD_User_ID 
		User within the system - Internal or Business Partner Contact
	  */
	public void setAD_User_ID (int AD_User_ID)
	{
		if (AD_User_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_AD_User_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_AD_User_ID, Integer.valueOf(AD_User_ID));
	}

	/** Get User/Contact.
		@return User within the system - Internal or Business Partner Contact
	  */
	public int getAD_User_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_User_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set expiredate.
		@param expiredate expiredate	  */
	public void setexpiredate (Timestamp expiredate)
	{
		set_Value (COLUMNNAME_expiredate, expiredate);
	}

	/** Get expiredate.
		@return expiredate	  */
	public Timestamp getexpiredate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_expiredate);
	}

	/** Set tokenvalue.
		@param tokenvalue tokenvalue	  */
	public void settokenvalue (String tokenvalue)
	{
		set_Value (COLUMNNAME_tokenvalue, tokenvalue);
	}

	/** Get tokenvalue.
		@return tokenvalue	  */
	public String gettokenvalue () 
	{
		return (String)get_Value(COLUMNNAME_tokenvalue);
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
}