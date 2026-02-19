package com.studentmanagementsystem;

import java.sql.*;
import java.util.*;

public class StudentDAO {

public Student getStudentById(int id) {
String sql = "SELECT * FROM students WHERE id = ?";
Student student = null;

try (Connection conn = DatabaseConnection.getConnection();
PreparedStatement pstmt = conn.prepareStatement(sql)) {

pstmt.setInt(1, id);
ResultSet rs = pstmt.executeQuery();

if (rs.next()) {
student = new Student();
student.setId(rs.getInt("id"));
student.setName(rs.getString("name"));
student.setEmail(rs.getString("email"));
student.setAge(rs.getInt("age"));
student.setGrade(rs.getString("grade"));
}

} catch (SQLException e) {
e.printStackTrace();
}

return student;
}

public List<Student> getAllStudents() {
String sql = "SELECT * FROM students";
List<Student> students = new ArrayList<>();

try (Connection conn = DatabaseConnection.getConnection();
Statement stmt = conn.createStatement();
ResultSet rs = stmt.executeQuery(sql)) {

while (rs.next()) {
Student student = new Student();
student.setId(rs.getInt("id"));
student.setName(rs.getString("name"));
student.setEmail(rs.getString("email"));
student.setAge(rs.getInt("age"));
student.setGrade(rs.getString("grade"));
students.add(student);
}

} catch (SQLException e) {
e.printStackTrace();
}

return students;
}

public boolean insertStudent(Student student) {
String sql = "INSERT INTO students (name, email, age, grade) VALUES (?, ?, ?, ?)";

try (Connection conn = DatabaseConnection.getConnection();
PreparedStatement pstmt = conn.prepareStatement(sql)) {

pstmt.setString(1, student.getName());

pstmt.setString(2, student.getEmail());
pstmt.setInt(3, student.getAge());
pstmt.setString(4, student.getGrade());

int rows = pstmt.executeUpdate();
return rows > 0;

} catch (SQLException e) {
e.printStackTrace();
return false;
}
}

public boolean updateStudent(Student student) {
String sql = "UPDATE students SET name = ?, email = ?, age = ?, grade = ? WHERE id = ?";

try (Connection conn = DatabaseConnection.getConnection();
PreparedStatement pstmt = conn.prepareStatement(sql)) {

pstmt.setString(1, student.getName());
pstmt.setString(2, student.getEmail());
pstmt.setInt(3, student.getAge());
pstmt.setString(4, student.getGrade());
pstmt.setInt(5, student.getId());

int rows = pstmt.executeUpdate();
return rows > 0;

} catch (SQLException e) {
e.printStackTrace();
return false;
}
}

public boolean deleteStudent(int id) {
String sql = "DELETE FROM students WHERE id = ?";

try (Connection conn = DatabaseConnection.getConnection();
PreparedStatement pstmt = conn.prepareStatement(sql)) {

pstmt.setInt(1, id);
int rows = pstmt.executeUpdate();
return rows > 0;

} catch (SQLException e) {
e.printStackTrace();
return false;
}
}
}
