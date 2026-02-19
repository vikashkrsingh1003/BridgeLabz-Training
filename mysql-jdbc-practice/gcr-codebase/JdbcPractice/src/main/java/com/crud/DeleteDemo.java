package com.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteDemo {
  public static void main(String[] args) throws Exception {
	
	  int stuid = 104;
	  Class.forName("com.mysql.cj.jdbc.Driver");
	  
	  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "vikash@1006");
	  
	  PreparedStatement ps = con.prepareStatement("Delete from student where stuid = ?");
	  ps.setInt(1, stuid);
	  
	  int result = ps.executeUpdate();
	  
	  if(result > 0) {
		  System.out.println("Delete done");
	  }else {
		  System.out.println("Delete failed");
	  }
	  
	  con.close();
	  
	  		
   }
}
