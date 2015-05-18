package com.cloud.dao;

import java.sql.Connection;

import org.apache.log4j.Logger;
import org.omg.CORBA.Request;

import java.sql.PreparedStatement;
import java.sql.Statement;

import com.cloud.bean.FormBean;
import com.cloud.util.DBUtility;
import com.cloud.*;

public class FormDAO {
	static Connection con = null;
	static PreparedStatement pt = null;
	static Statement st = null;
	private final static Logger log = Logger.getLogger(FormDAO.class);

	public static FormBean FormDetails(FormBean beanobj)
			throws Exception {
		try {
			
			con = DBUtility.createConnection();
			log.info("Before inserting into table");
			//String query = "insert into \"USER03523\".\"RedTrain_formDetails\" (name,age,gender,berth,meal,issenior,identityproof) values(?,?,?,?,?,?,?)";
			String query= "INSERT INTO USER04233.REDTRAIN_FORMDETAILS VALUES (?,?,?,?,?,?,?)";
			pt = con.prepareStatement(query);
			pt.setString(1, beanobj.getName());
			pt.setString(2, beanobj.getAge());
			pt.setString(3, beanobj.getGender());
			pt.setString(4, beanobj.getBerth());
			pt.setString(5, beanobj.getMeal());
			pt.setString(6, beanobj.getIsSenior());
			pt.setString(7, beanobj.getIDproof());
			pt.executeUpdate();
			con.commit();
			log.info("After inserting into table");
			


		} catch (Exception e) {
			log.error("Exception", e);
			e.printStackTrace();
		} finally {
			con.close();
			pt.close();

		}
		return beanobj;
	}

	public static FormBean deleteDetails(FormBean beanobj)
			throws Exception {
		try {
			con = DBUtility.createConnection();
			st = con.createStatement();
			log.info("Before deleting from table");
			String query = "delete from REGISTRATION where NAME='"
					+ beanobj.getName() + "' ";
			st.executeUpdate(query);
			con.commit();

		} catch (Exception e) {
			log.error("Exception", e);
			e.printStackTrace();
		} finally {
			con.close();
			st.close();

		}
		return beanobj;
	}

}
