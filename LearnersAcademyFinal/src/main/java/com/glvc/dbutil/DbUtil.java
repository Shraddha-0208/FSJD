package com.glvc.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * 1.register the driver
2.connection with the dB→single responsibility principle -DbUtil-database utility

 * */
public class DbUtil {
public static final String DRIVER_CLASS="com.mysql.cj.jdbc.Driver";
public static final String DB_URL="jdbc:mysql://localhost:3306/db4";
public static final String USERNAME="root";
public static final String PASSWORD="advait";
	public static Connection dbConn() throws SQLException, ClassNotFoundException {
		//register the driver
		Class.forName(DRIVER_CLASS);
		//connection statement
		Connection con=DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
		return con;
	}
	
}
