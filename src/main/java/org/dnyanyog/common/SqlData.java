package org.dnyanyog.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlData {
	private static String Url = "jdbc:mysql://127.0.0.1:3306/user_management";
	private static String username = "root";
	private static String password = "Shree@123";
	
	private static Connection connection;
	
	static
	{
		try {
			connection = DriverManager.getConnection(Url,username,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static ResultSet executeSelectQuery(String query) throws SQLException {
		Statement statement = connection.createStatement();
		
		ResultSet result = statement.executeQuery(query);
		
		return result;
	}


}