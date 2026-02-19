package com.storedprocedure;

import java.sql.*;

public class StoredProcedureExample {

	public static void callStoredProcedure(String grade) {
	String sql = "{CALL GetStudentsByGrade(?)}";

	try (Connection conn = DatabaseConnection.getConnection();
	CallableStatement cstmt = conn.prepareCall(sql)) {

	cstmt.setString(1, grade);

	boolean hasResults = cstmt.execute();

	if (hasResults) {
	ResultSet rs = cstmt.getResultSet();

	while (rs.next()) {
	System.out.println("ID: " + rs.getInt("id"));

	System.out.println("Name: " + rs.getString("name"));
	System.out.println("Grade: " + rs.getString("grade"));
	System.out.println("----");
	}
	}

	} catch (SQLException e) {
	e.printStackTrace();
	}
	}

	public static void callProcedureWithOutParam() {
	String sql = "{CALL GetStudentCount(?)}";

	try (Connection conn = DatabaseConnection.getConnection();
	CallableStatement cstmt = conn.prepareCall(sql)) {

	cstmt.registerOutParameter(1, java.sql.Types.INTEGER);
	cstmt.execute();

	int totalStudents = cstmt.getInt(1);
	System.out.println("Total students: " + totalStudents);

	} catch (SQLException e) {
	e.printStackTrace();
	}
	}
	}
