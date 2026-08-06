package com.jdbcPractice.JDBC_PRACTICE;
import java.sql.*;

public class StudentBetween {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/jdbcpracticedb",
                    "root",
                    "vikash@1006");

            Statement stmt = con.createStatement();

            String sql = "SELECT * FROM student WHERE age BETWEEN 20 AND 22";

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " " +
                        rs.getString("name") + " " +
                        rs.getInt("age") + " " +
                        rs.getString("course"));
            }

            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}