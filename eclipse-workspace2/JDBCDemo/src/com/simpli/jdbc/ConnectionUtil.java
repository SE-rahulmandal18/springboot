package com.simpli.jdbc;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionUtil {

	private static Connection con;
	
	public static Connection getConnection() {
		
	try(FileInputStream fin  = new FileInputStream("db.properties");) {
		
		Properties p = new Properties();
		p.load(fin);
		
		// loading and registering the driver
		Class.forName(p.getProperty("driver"));
		
		// Establish the connection
		
		 con = DriverManager.getConnection(p.getProperty("url"), p.getProperty("username"), p.getProperty("password"));
		
		 System.out.println("Conncection Established.....");
		 
		 
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	return con;
			
		
	
  }
}
