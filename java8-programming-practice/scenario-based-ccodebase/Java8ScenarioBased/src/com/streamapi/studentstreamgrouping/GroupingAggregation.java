package com.streamapi.studentstreamgrouping;

import java.util.*;
import java.util.stream.*;

public class GroupingAggregation {

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
            new Student(1, "Ravi", 26, "Male", "Delhi", "Mechanical", 45),
            new Student(2, "Amit", 24, "Male", "Mumbai", "CSE", 60),
            new Student(3, "Neha", 28, "Female", "Pune", "Mechanical", 30),
            new Student(4, "Priya", 22, "Female", "Mumbai", "Electrical", 20),
            new Student(5, "Rahul", 27, "Male", "Delhi", "Mechanical", 55),
            new Student(6, "Anita", 25, "Female", "Pune", "CSE", 35)
        );

        // 1. Count students in each department
        System.out.println("1. Students count by Department:");
        students.stream()
                .collect(Collectors.groupingBy(
                        Student::getDepartment, Collectors.counting()))
                .forEach((d, c) -> System.out.println(d + " : " + c));

        // 2. Count students in each city
        System.out.println("\n2. Students count by City:");
        students.stream()
                .collect(Collectors.groupingBy(
                        Student::getCity, Collectors.counting()))
                .forEach((c, n) -> System.out.println(c + " : " + n));

        // 3. Average age of students in each department
        System.out.println("\n3. Average Age by Department:");
        students.stream()
                .collect(Collectors.groupingBy(
                        Student::getDepartment,
                        Collectors.averagingInt(Student::getAge)))
                .forEach((d, a) -> System.out.println(d + " : " + a));

        // 4. Average rank of students by gender
        System.out.println("\n4. Average Rank by Gender:");
        students.stream()
                .collect(Collectors.groupingBy(
                        Student::getGender,
                        Collectors.averagingInt(Student::getRank)))
                .forEach((g, r) -> System.out.println(g + " : " + r));

        // 5. Total number of students
        long totalStudents = students.stream().count();
        System.out.println("\n5. Total Students: " + totalStudents);

        // 6. Department with highest average rank
        System.out.println("\n6. Department with Highest Average Rank:");
        students.stream()
                .collect(Collectors.groupingBy(
                        Student::getDepartment,
                        Collectors.averagingInt(Student::getRank)))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .ifPresent(e ->
                        System.out.println(e.getKey() + " : " + e.getValue()));
    }
}
