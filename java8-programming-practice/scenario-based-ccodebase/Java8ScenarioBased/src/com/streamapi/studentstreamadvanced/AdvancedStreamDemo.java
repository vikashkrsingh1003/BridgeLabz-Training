package com.streamapi.studentstreamadvanced;

import java.util.*;
import java.util.stream.*;

public class AdvancedStreamDemo {

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
            new Student(1, "Ravi", "Mechanical", 45),
            new Student(2, "Sanjay", "CSE", 60),
            new Student(3, "Sneha", "Mechanical", 30),
            new Student(4, "Priyanka", "Electrical", 20),
            new Student(5, "Suresh", "CSE", 55),
            new Student(6, "Anita", "Mechanical", 35)
        );

        // 1. Convert student list into Map<Id, Name>
        System.out.println("1. Map<Id, Name>:");
        Map<Integer, String> idNameMap = students.stream()
                .collect(Collectors.toMap(
                        Student::getId,
                        Student::getName
                ));
        System.out.println(idNameMap);

        // 2. Convert student list into Map<Department, List<Student>>
        System.out.println("\n2. Map<Department, List<Student>>:");
        Map<String, List<Student>> deptMap = students.stream()
                .collect(Collectors.groupingBy(Student::getDepartment));
        deptMap.forEach((d, list) -> System.out.println(d + " : " + list));

        // 3. Students whose name starts with 'S'
        System.out.println("\n3. Names starting with 'S':");
        students.stream()
                .filter(s -> s.getName().startsWith("S"))
                .forEach(System.out::println);

        // 4. Students whose name length > 5
        System.out.println("\n4. Name length > 5:");
        students.stream()
                .filter(s -> s.getName().length() > 5)
                .forEach(System.out::println);

        // 5. Students whose rank is even
        System.out.println("\n5. Even Rank Students:");
        students.stream()
                .filter(s -> s.getRank() % 2 == 0)
                .forEach(System.out::println);

        // 6. Students whose rank is odd
        System.out.println("\n6. Odd Rank Students:");
        students.stream()
                .filter(s -> s.getRank() % 2 != 0)
                .forEach(System.out::println);
    }
}
