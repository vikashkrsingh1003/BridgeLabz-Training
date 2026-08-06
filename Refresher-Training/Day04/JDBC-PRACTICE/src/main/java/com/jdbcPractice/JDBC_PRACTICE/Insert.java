package com.jdbcPractice.JDBC_PRACTICE;

import java.sql.*;
public class Insert {

	public static void main(String args[]) {
		
		try {
			
			//Load the jdbc driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//create the connection
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/jdbcpracticedb",
					"root",
					"vikash@1006"
					);
			
			//create statement
			
			Statement stmt = con.createStatement();
			
			//sql query
			
			String sql = "INSERT INTO student(id, name, age, course) " +
		             "VALUES (4, 'saurav', 22, 'b.tech') , (5, 'rajiv', 24 , 'b.sc') ";
			
			
			//execute query
			stmt.executeUpdate(sql);
			
			System.out.println("Student data insert successfully!");

            // Close Connection
            stmt.close();
            con.close();
			
			
		}catch(Exception e) {
			System.out.println(e);			 
		}
		
	}
}
