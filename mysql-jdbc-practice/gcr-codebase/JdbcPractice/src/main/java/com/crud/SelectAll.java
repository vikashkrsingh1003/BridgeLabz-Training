package com.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectAll {
   public static void main(String[] args) throws Exception {
	
	   Class.forName("com.mysql.cj.jdbc.Driver");
	   
	   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "vikash@1006");
	   
	   PreparedStatement ps = con.prepareStatement("select * from student");
	   
	   ResultSet rs = ps.executeQuery();
	   
	   while(rs.next()) {
		   
		   int stuid1 = rs.getInt("stuid");
		   System.out.println(stuid1);
		   
		   String name1 = rs.getString("name");
		   System.out.println("Name "+ name1);
		   
		   String email1 = rs.getString("email");
		   System.out.println("Email "+ email1);
		   
		   int mobilenum = rs.getInt("mobile");
		   System.out.println("mobile number "+ mobilenum);
		   
		   
		   
		   System.out.println("-------------------------------------");
		   
	   }
	   
	   con.close();
	   
	   
   }
}
