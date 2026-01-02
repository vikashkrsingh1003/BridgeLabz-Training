package com.inheritance.hierarchicalinheritance.schoolsystem;

public class Main {
    public static void main(String[] args) {

        Person teacher = new Teacher("Alice", 35, "Mathematics");
        Person student = new Student("Bob", 16, "10th Grade");
        Person staff = new Staff("Charlie", 40, "Administration");

        teacher.displayRole();
        System.out.println();
        student.displayRole();
        System.out.println();
        staff.displayRole();
    }
}
