package com.collectors.studentresultgrouping;

import java.util.*;
import java.util.stream.Collectors;

public class StudentGrouping {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Ram", "A"),
                new Student("Amit", "B"),
                new Student("Neha", "A"),
                new Student("Priya", "B")
        );

        Map<String, List<String>> result =
                students.stream()
                        .collect(Collectors.groupingBy(
                                Student::getGrade,
                                Collectors.mapping(Student::getName, Collectors.toList())
                        ));

        System.out.println(result);
    }
}
