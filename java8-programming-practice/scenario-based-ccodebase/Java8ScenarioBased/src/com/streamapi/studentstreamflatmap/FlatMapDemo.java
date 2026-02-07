package com.streamapi.studentstreamflatmap;

import java.util.*;

public class FlatMapDemo {

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
            new Student(1, "Ravi", Arrays.asList("9999", "8888")),
            new Student(2, "Amit", Arrays.asList("7777")),
            new Student(3, "Neha", Arrays.asList("6666", "5555")),
            new Student(4, "Priya", Arrays.asList("4444"))
        );

        // 1. Print all contact numbers of all students
        System.out.println("1. All Contact Numbers:");
        students.stream()
                .flatMap(s -> s.getContacts().stream())
                .forEach(System.out::println);

        // 2. Count total number of contact numbers
        long totalContacts = students.stream()
                .flatMap(s -> s.getContacts().stream())
                .count();
        System.out.println("\n2. Total Contact Numbers: " + totalContacts);

        // 3. Students with more than one contact number
        System.out.println("\n3. Students with more than one contact:");
        students.stream()
                .filter(s -> s.getContacts().size() > 1)
                .forEach(s -> System.out.println(s.getName()));

        // 4. Print unique contact numbers
        System.out.println("\n4. Unique Contact Numbers:");
        students.stream()
                .flatMap(s -> s.getContacts().stream())
                .distinct()
                .forEach(System.out::println);
    }
}
