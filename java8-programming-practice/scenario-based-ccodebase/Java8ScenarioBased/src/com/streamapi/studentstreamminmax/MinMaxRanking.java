package com.streamapi.studentstreamminmax;

import java.util.*;

public class MinMaxRanking {

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
            new Student(1, "Ravi", 26, 45),
            new Student(2, "Amit", 24, 60),
            new Student(3, "Neha", 28, 30),
            new Student(4, "Priya", 22, 20),
            new Student(5, "Rahul", 27, 55),
            new Student(6, "Anita", 21, 35)
        );

        // 1. Student with best (lowest) rank
        System.out.println("1. Best Rank Holder:");
        students.stream()
                .min(Comparator.comparingInt(Student::getRank))
                .ifPresent(System.out::println);

        // 2. Student with worst (highest) rank
        System.out.println("\n2. Worst Rank Holder:");
        students.stream()
                .max(Comparator.comparingInt(Student::getRank))
                .ifPresent(System.out::println);

        // 3. Second best rank holder
        System.out.println("\n3. Second Best Rank Holder:");
        students.stream()
                .sorted(Comparator.comparingInt(Student::getRank))
                .skip(1)
                .findFirst()
                .ifPresent(System.out::println);

        // 4. Third best rank holder
        System.out.println("\n4. Third Best Rank Holder:");
        students.stream()
                .sorted(Comparator.comparingInt(Student::getRank))
                .skip(2)
                .findFirst()
                .ifPresent(System.out::println);

        // 5. Youngest student
        System.out.println("\n5. Youngest Student:");
        students.stream()
                .min(Comparator.comparingInt(Student::getAge))
                .ifPresent(System.out::println);

        // 6. Oldest student
        System.out.println("\n6. Oldest Student:");
        students.stream()
                .max(Comparator.comparingInt(Student::getAge))
                .ifPresent(System.out::println);
    }
}
