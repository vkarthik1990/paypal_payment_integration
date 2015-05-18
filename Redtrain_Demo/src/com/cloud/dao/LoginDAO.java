package com.cloud.dao;

import java.sql.Connection;

import org.apache.log4j.Logger;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.cloud.bean.LoginBean;
import com.cloud.util.DBUtility;
import com.cloud.*;

public class LoginDAO {
	static Connection con = null;
	static Statement st = null;

	private final static Logger log = Logger.getLogger(LoginDAO.class);

	public static boolean login(LoginBean beanobj) throws Exception {

		try {
			con = DBUtility.createConnection();
			st=con.createStatement();
			System.out.println("Before selecting into table ");
			log.info("Before inserting into table");
			String s="";
			String query = "SELECT * FROM \"USER04233\".\"REDTRAIN_USERDETAILS\" WHERE username='"+beanobj.getUserName()+"' and pwd='"+beanobj.getPassword()+"'";
			ResultSet rs=st.executeQuery(query);
			if(rs.next())
			{
				return true;
			}
			log.info("After inserting into table");

		} catch (Exception e) {
			log.error("Exception", e);
			e.printStackTrace();
		} finally {
			con.close();

		}
		return false;
	}

}
