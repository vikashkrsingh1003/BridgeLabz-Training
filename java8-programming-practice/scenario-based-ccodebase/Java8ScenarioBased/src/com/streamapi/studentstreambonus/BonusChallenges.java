package com.streamapi.studentstreambonus;

import java.util.*;
import java.util.stream.*;

public class BonusChallenges {

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
            new Student(1, "Ravi", 26, 45, "Delhi", "Mechanical"),
            new Student(2, "Amit", 24, 120, "Mumbai", "CSE"),
            new Student(3, "Neha", 21, 30, "Pune", "Mechanical"),
            new Student(4, "Priya", 22, 20, "Mumbai", "Electrical"),
            new Student(5, "Rahul", 27, 55, "Delhi", "Mechanical"),
            new Student(6, "Anita", 23, 80, "Pune", "CSE"),
            new Student(7, "Suresh", 29, 150, "Delhi", "Electrical")
        );

        // 1. Top 3 youngest students
        System.out.println("1. Top 3 Youngest Students:");
        students.stream()
                .sorted(Comparator.comparingInt(Student::getAge))
                .limit(3)
                .forEach(System.out::println);

        // 2. Top 3 oldest students
        System.out.println("\n2. Top 3 Oldest Students:");
        students.stream()
                .sorted(Comparator.comparingInt(Student::getAge).reversed())
                .limit(3)
                .forEach(System.out::println);

        // 3. Partition students based on age > 25
        System.out.println("\n3. Partition by Age > 25:");
        Map<Boolean, List<Student>> agePartition =
                students.stream()
                        .collect(Collectors.partitioningBy(s -> s.getAge() > 25));
        agePartition.forEach((k, v) ->
                System.out.println(k + " : " + v));

        // 4. Partition students based on rank < 100
        System.out.println("\n4. Partition by Rank < 100:");
        Map<Boolean, List<Student>> rankPartition =
                students.stream()
                        .collect(Collectors.partitioningBy(s -> s.getRank() < 100));
        rankPartition.forEach((k, v) ->
                System.out.println(k + " : " + v));

        // 5. City having maximum students
        System.out.println("\n5. City with Maximum Students:");
        students.stream()
                .collect(Collectors.groupingBy(
                        Student::getCity, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .ifPresent(e ->
                        System.out.println(e.getKey() + " : " + e.getValue()));

        // 6. Department having minimum students
        System.out.println("\n6. Department with Minimum Students:");
        students.stream()
                .collect(Collectors.groupingBy(
                        Student::getDepartment, Collectors.counting()))
                .entrySet()
                .stream()
                .min(Map.Entry.comparingByValue())
                .ifPresent(e ->
                        System.out.println(e.getKey() + " : " + e.getValue()));
    }
}
