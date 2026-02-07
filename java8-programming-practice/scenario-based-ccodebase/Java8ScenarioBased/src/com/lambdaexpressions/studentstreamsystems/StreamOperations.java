package com.lambdaexpressions.studentstreamsystems;

import java.util.*;

public class StreamOperations {

    public static void main(String[] args) {

        List<Student> students = DataSource.getStudents();

        // 1. Rank < 50
        System.out.println("Rank < 50:");
        students.stream()
                .filter(s -> s.rank < 50)
                .forEach(System.out::println);

        // 2. Age > 25
        System.out.println("\nAge > 25:");
        students.stream()
                .filter(s -> s.age > 25)
                .forEach(System.out::println);

        // 3. Print names only
        System.out.println("\nStudent Names:");
        students.stream()
                .map(s -> s.firstName)
                .forEach(System.out::println);

        // 4. Mechanical Engineering students
        System.out.println("\nMechanical Engineering Students:");
        students.stream()
                .filter(s -> s.branch.equals("Mechanical Engineering"))
                .forEach(System.out::println);

        // 5. Students not from Mumbai
        System.out.println("\nStudents not from Mumbai:");
        students.stream()
                .filter(s -> !s.city.equals("Mumbai"))
                .forEach(System.out::println);
    }
}
