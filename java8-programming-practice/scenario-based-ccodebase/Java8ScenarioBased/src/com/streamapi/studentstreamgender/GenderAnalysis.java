package com.streamapi.studentstreamgender;

import java.util.*;
import java.util.stream.*;

public class GenderAnalysis {

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
            new Student(1, "Ravi", 26, "Male", 45),
            new Student(2, "Amit", 24, "Male", 60),
            new Student(3, "Neha", 28, "Female", 30),
            new Student(4, "Priya", 22, "Female", 20),
            new Student(5, "Rahul", 27, "Male", 55),
            new Student(6, "Anita", 25, "Female", 35)
        );

        // 1. Count male and female students
        System.out.println("1. Count by Gender:");
        students.stream()
                .collect(Collectors.groupingBy(
                        Student::getGender, Collectors.counting()))
                .forEach((g, c) -> System.out.println(g + " : " + c));

        // 2. Average age of male students
        double avgMaleAge = students.stream()
                .filter(s -> s.getGender().equals("Male"))
                .collect(Collectors.averagingInt(Student::getAge));
        System.out.println("\n2. Average Age of Male Students: " + avgMaleAge);

        // 3. Average age of female students
        double avgFemaleAge = students.stream()
                .filter(s -> s.getGender().equals("Female"))
                .collect(Collectors.averagingInt(Student::getAge));
        System.out.println("3. Average Age of Female Students: " + avgFemaleAge);

        // 4. Highest ranked male student (lowest rank number)
        System.out.println("\n4. Highest Ranked Male Student:");
        students.stream()
                .filter(s -> s.getGender().equals("Male"))
                .min(Comparator.comparingInt(Student::getRank))
                .ifPresent(System.out::println);

        // 5. Highest ranked female student (lowest rank number)
        System.out.println("\n5. Highest Ranked Female Student:");
        students.stream()
                .filter(s -> s.getGender().equals("Female"))
                .min(Comparator.comparingInt(Student::getRank))
                .ifPresent(System.out::println);
    }
}
