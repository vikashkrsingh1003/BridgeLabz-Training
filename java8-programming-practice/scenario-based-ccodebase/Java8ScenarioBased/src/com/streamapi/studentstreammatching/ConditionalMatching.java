package com.streamapi.studentstreammatching;

import java.util.*;

public class ConditionalMatching {

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
            new Student(1, "Ravi", 26, "Mechanical"),
            new Student(2, "Amit", 24, "CSE"),
            new Student(3, "Neha", 28, "Biotech"),
            new Student(4, "Priya", 22, "Electrical"),
            new Student(5, "Rahul", 27, "Mechanical")
        );

        // 1. Check if any student belongs to Biotech Engineering
        boolean anyBiotech = students.stream()
                .anyMatch(s -> s.getDepartment().equals("Biotech"));
        System.out.println("1. Any student from Biotech Engineering: " + anyBiotech);

        // 2. Check if all students are above age 20
        boolean allAbove20 = students.stream()
                .allMatch(s -> s.getAge() > 20);
        System.out.println("2. All students above age 20: " + allAbove20);

        // 3. Check if no student belongs to Civil Engineering
        boolean noCivil = students.stream()
                .noneMatch(s -> s.getDepartment().equals("Civil"));
        System.out.println("3. No student from Civil Engineering: " + noCivil);
    }
}
