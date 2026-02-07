package com.streamapi.studentstreamdepartment;

import java.util.*;
import java.util.stream.*;

public class DepartmentQueries {

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
            new Student(1, "Ravi", 26, "Mechanical Engineering", "Karnataka", 45),
            new Student(2, "Amit", 24, "Computer Engineering", "Maharashtra", 60),
            new Student(3, "Neha", 21, "Computer Engineering", "Karnataka", 30),
            new Student(4, "Priya", 22, "Electronics Engineering", "Karnataka", 20),
            new Student(5, "Rahul", 27, "Mechanical Engineering", "Tamil Nadu", 55),
            new Student(6, "Anita", 23, "Electronics Engineering", "Karnataka", 35)
        );

        // 1. List students department-wise with names only
        System.out.println("1. Students Department-wise (Names Only):");
        students.stream()
                .collect(Collectors.groupingBy(
                        Student::getDepartment,
                        Collectors.mapping(Student::getName, Collectors.toList())
                ))
                .forEach((d, names) ->
                        System.out.println(d + " : " + names));

        // 2. Youngest student in Computer Engineering
        System.out.println("\n2. Youngest Student in Computer Engineering:");
        students.stream()
                .filter(s -> s.getDepartment().equals("Computer Engineering"))
                .min(Comparator.comparingInt(Student::getAge))
                .ifPresent(s -> System.out.println(s.getName()));

        // 3. Top-ranked student in Mechanical Engineering
        System.out.println("\n3. Top-ranked Student in Mechanical Engineering:");
        students.stream()
                .filter(s -> s.getDepartment().equals("Mechanical Engineering"))
                .min(Comparator.comparingInt(Student::getRank))
                .ifPresent(s -> System.out.println(s.getName()));

        // 4. Count students in Electronics Engineering from Karnataka
        long count = students.stream()
                .filter(s -> s.getDepartment().equals("Electronics Engineering"))
                .filter(s -> s.getState().equals("Karnataka"))
                .count();
        System.out.println("\n4. Electronics Engineering students from Karnataka: " + count);
    }
}
