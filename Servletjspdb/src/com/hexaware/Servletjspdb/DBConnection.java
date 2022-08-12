package com.hexaware.Servletjspdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class DBConnection {
	
	private static Connection conn = null;
	public DBConnection() {
		
	}
	
	public static Connection getDBConnection() {
		
		//Register the Driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
		
		//Establish DB Connection
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","Bhuvana123");
		
		
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}

}