package com.cloud.util;

import java.sql.*;

public class DBUtility {
	static Connection con = null;

	public static Connection createConnection() throws Exception {
	/*	try {
			Class.forName("IBM DB2 ODBC DRIVER").newInstance();
			String URL = "jdbc:db2://75.126.155.153:50001/SQLDB:securityMechanism=9";
			
			//String URL = "jdbc:sqlserver://KARTHIK;instanceName=KARTHIK;databaseName=RedTrain_DB";
			 
			  String USERNAME = "sa";//UserName
			     String PASSWORD = "K@rthik1990";//Password
			    //con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			     String connectionUrl = "jdbc:sqlserver://localhost:1434;" +"databaseName=RedTrain_DB;user=sa;password=K@rthik1990";
			con = DriverManager.getConnection(URL);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		}
		return con;

	*/
		
		
		
		String ServerName = "75.126.155.153";
		int PortNumber = 50001;
		String DatabaseName = "SQLDB";
		String user = "user04233";
		String userPassword = "xtchwcrNDQri";

		java.util.Properties properties = new java.util.Properties();

		properties.put("user", user);
		properties.put("password", userPassword);
		properties.put("sslConnection", "true");

		//String url = "jdbc:db2://" + ServerName + ":"+ PortNumber + "/" +
		//DatabaseName + ":" + "sslConnection=true" + ";";
		String url = "jdbc:db2://75.126.155.153:50000/SQLDB";
		java.sql.Connection con = null; 
		try
		{
			Class.forName("com.ibm.db2.jcc.DB2Driver").newInstance(); 
		}
		catch ( Exception e )
		{
			System.out.println("Error: failed to load Db2 jcc driver."); 
		}

		try
		{
			System.out.println("url: " + url);
			con =java.sql.DriverManager.getConnection(url,user,userPassword);
			//con = java.sql.DriverManager.getConnection(url, properties);
			if (con != null) {
				System.out.println("Success"+con);
			} else { 
				System.out.println("Failed to make the connection");
			}
			//con.close();
		}
		catch (Exception e)
		{
			if (con != null) {
				try {
					con.close(); 
				} catch (Exception e2) {
					e2.printStackTrace(); 
		}
		 }
		e.printStackTrace();
		}
		return con;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}

}
