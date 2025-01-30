package org.dnyanyog.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.dnyanyog.common.SqlData;

public class StudentService {
	public String getName(String username) {
		ResultSet rs;
		try {
		 rs = SqlData.executeSelectQuery("Select * from user where username = '"+username+"'");
		 rs.next();
		 return rs.getString(1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "Some error occured";
		}
	}
	
	public String getEmail(String username) {
		try {
			ResultSet rs = SqlData.executeSelectQuery("Select * from user where username = '"+username+"'");
			 rs.next();
			return rs.getString(2);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "Some error occured";
		}
	}
	
	public String getMobile(String username) {
		try {
			ResultSet rs =  SqlData.executeSelectQuery("Select * from user where username = '"+username+"'");
			 rs.next();
			return rs.getString(3);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "Some error occured";

		}
	}
	 public List<String> getname() throws SQLException{
		 String query = "Select * from user";
		 
		 ArrayList<String> names = new ArrayList<>();
		 
			
			ResultSet rs = SqlData.executeSelectQuery(query);
			while(rs.next()) {
				for(int i = 1;i<4;i++) {
					names.add(rs.getString(i));
					System.out.println(rs.getString(i));
				}
				
			}
			
			return names;
				
	}
}
