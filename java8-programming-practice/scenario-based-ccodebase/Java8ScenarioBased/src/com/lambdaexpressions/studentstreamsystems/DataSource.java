package com.lambdaexpressions.studentstreamsystems;

import java.util.*;

public class DataSource {

    public static List<Student> getStudents() {

        return Arrays.asList(
            new Student(1, "Ravi", 26, "Male", "Delhi", "Mechanical Engineering", 45, "9999999999"),
            new Student(2, "Amit", 24, "Male", "Mumbai", "Computer Science", 60, "8888888888"),
            new Student(3, "Neha", 28, "Female", "Pune", "Mechanical Engineering", 30, "7777777777"),
            new Student(4, "Priya", 22, "Female", "Mumbai", "Electrical", 20, "6666666666"),
            new Student(5, "Rahul", 27, "Male", "Bangalore", "Mechanical Engineering", 55, "5555555555")
        );
    }
}
