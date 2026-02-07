package com.streamapi.studentstreamsystemsorting;

import java.util.*;

public class SortingLimiting {

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
            new Student(1, "Ravi", 26, 45),
            new Student(2, "Amit", 24, 60),
            new Student(3, "Neha", 28, 30),
            new Student(4, "Priya", 22, 20),
            new Student(5, "Rahul", 27, 55)
        );

        // 1. Sort by rank (ascending)
        System.out.println("1. Sorted by Rank:");
        students.stream()
                .sorted(Comparator.comparingInt(Student::getRank))
                .forEach(System.out::println);

        // 2. Sort by age (descending)
        System.out.println("\n2. Sorted by Age (Descending):");
        students.stream()
                .sorted(Comparator.comparingInt(Student::getAge).reversed())
                .forEach(System.out::println);

        // 3. Top 5 students by rank
        System.out.println("\n3. Top 5 Students:");
        students.stream()
                .sorted(Comparator.comparingInt(Student::getRank))
                .limit(5)
                .forEach(System.out::println);

        // 4. Last 3 students by rank
        System.out.println("\n4. Last 3 Students:");
        students.stream()
                .sorted(Comparator.comparingInt(Student::getRank).reversed())
                .limit(3)
                .forEach(System.out::println);

        // 5. Sort by name and then rank
        System.out.println("\n5. Sorted by Name then Rank:");
        students.stream()
                .sorted(
                    Comparator.comparing(Student::getName)
                              .thenComparingInt(Student::getRank)
                )
                .forEach(System.out::println);
    }
}
