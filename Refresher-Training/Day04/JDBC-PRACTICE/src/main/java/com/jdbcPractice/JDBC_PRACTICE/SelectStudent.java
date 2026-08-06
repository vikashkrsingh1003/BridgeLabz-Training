package com.jdbcPractice.JDBC_PRACTICE;

import java.sql.*;
public class SelectStudent {

	 public static void main(String args[]) {
		 
		try { 
			
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 
		 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpracticedb"
				 ,"root" , "vikash@1006");
		 
		 Statement stmt = con.createStatement();
		 
		 String sql = "Select * from student";
		 
		 
		 ResultSet res = stmt.executeQuery(sql);
		 
		 
		 //Display data
		 
		 while(res.next()){
			 
			 System.out.println(
					 
					 res.getInt("id") + " " + res.getString("name")+ " " + res.getInt("age") + " "+ res.getString("course")
					 );
		 }
		 
		 res.close();
		 con.close();
		 stmt.close();
		 
		}catch(Exception e) {
			
			System.out.println(e);
		 
		 
				 
		}
	 }
}
