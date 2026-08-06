package com.jdbcPractice.JDBC_PRACTICE;

import java.sql.*;

public class UpdateStudent {
    public static void main(String[] args) {

        try {
        	
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/jdbcpracticedb",
                    "root",
                    "vikash@1006");

            Statement stmt = con.createStatement();

            String sql = "UPDATE student SET course='MCA' WHERE id=1";

            
            int rows = stmt.executeUpdate(sql);

            System.out.println(rows + " record updated successfully.");

            stmt.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}