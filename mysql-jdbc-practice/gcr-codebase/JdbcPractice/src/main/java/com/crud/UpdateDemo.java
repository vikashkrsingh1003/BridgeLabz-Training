package com.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateDemo {

	public static void main(String[] args) throws Exception {
		
		String email = "koti@gmail.com";
		int stuid = 105;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root", "vikash@1006");
		
		PreparedStatement ps = con.prepareStatement("update student set email = ? where stuid = ?");
		
		ps.setString(1, email);
		ps.setInt(2, stuid);
		
		int res = ps.executeUpdate();
		
		if(res > 0) {
			System.out.println("Updated successfully");
		}else {
			System.out.println("Upatation feiled");
		}
		con.close();
	}
}
