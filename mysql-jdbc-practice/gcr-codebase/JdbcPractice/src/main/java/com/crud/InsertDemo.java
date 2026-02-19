package com.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.*;
public class InsertDemo {
	
	public static void insertStudent(int stuid , String name, String email , int mobileno) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root", "vikash@1006");
		
		
		 PreparedStatement ps = con.prepareStatement("Insert into student values(?,?,?,?)");
		 
		 ps.setInt(1,stuid);
		 ps.setString(2,name);
		 ps.setString(3,email);
		 ps.setInt(4,mobileno);
		
		 int inserted = ps.executeUpdate();
		 System.out.println(inserted + " Details inserted successfully!");
		 
		 con.close();
	}
	
	 public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 String choice ;
		 do{
		
			
		 System.out.println("Enter Student id : ->" );
		 int stuid = sc.nextInt();
		 
		 System.out.println("Enter Student name : ->" );
		 String name = sc.next();
		 
		 System.out.println("Enter Student email : ->" );
		 String email = sc.next();
		 
		 System.out.println("Enter Student Mobile number : ->" );
		 int mobileno = sc.nextInt();
		 
		 
		 try {
			insertStudent(stuid, name, email, mobileno);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		 System.out.println("Do you want to insert again? (type yes/no)");
         choice = sc.next();
         
		 }while (choice.equalsIgnoreCase("yes"));
		 
		 System.out.println("Thank you!");
	     sc.close();
		 
	}
	 
	 
}
