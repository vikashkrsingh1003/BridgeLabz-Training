package com.day08.eduresult;

public class Main {
    public static void main(String[] args) {
        Student[] students = {
            new Student("Anita", 85),
            new Student("Rahul", 92),
            new Student("Suresh", 85),
            new Student("Meena", 78),
            new Student("Karan", 92)
        };

        MergeSort.mergeSort(students, 0, students.length - 1);

        System.out.println("State-wise Rank List:");
        for (Student s : students) {
            System.out.println(s.name + " - " + s.marks);
        }
    }
}
