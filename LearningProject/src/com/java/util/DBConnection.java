package com.java.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	public static  Connection getConnection() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
	Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/learning", "root", "root");
	
	return c;
	}
	
}




 