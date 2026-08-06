package com.jdbcPractice.JDBC_PRACTICE;

import java.sql.*;

public class CreateTable {
    public static void main(String[] args) {
        
    	 try {
              // Step 1: Load the JDBC Driver
             Class.forName("com.mysql.cj.jdbc.Driver");

             // Step 2: Establish the Connection
             Connection con = DriverManager.getConnection(
                     "jdbc:mysql://localhost:3306/jdbcpracticedb",
                     "root",
                     "vikash@1006");

             // Create Statement
             Statement stmt = con.createStatement();

             // SQL Query
             String sql = "CREATE TABLE student ("
                     + "id INT PRIMARY KEY, "
                     + "name VARCHAR(50), "
                     + "age INT, "
                     + "course VARCHAR(50))";

             // Execute Query
             stmt.executeUpdate(sql);

             System.out.println("Student table created successfully!");

             // Close Connection
             stmt.close();
             con.close();

         } catch (Exception e) {
             System.out.println(e);
         }
    }
}
