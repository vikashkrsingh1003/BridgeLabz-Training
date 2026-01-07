package com.day03.campusconnect;

public class CampusConnectMain {

    public static void main(String[] args) {

        // Create Faculty
        Faculty faculty1 = new Faculty(
                101,
                "Dr. Sharma",
                "sharma@university.edu",
                "Computer Science"
        );

        // Create Course
        Course javaCourse = new Course(
                "Object Oriented Programming",
                faculty1
        );

        // Create Students
        Student s1 = new Student(
                201,
                "Aman",
                "aman@student.edu"
        );

        Student s2 = new Student(
                202,
                "Riya",
                "riya@student.edu"
        );

        // Add grades (private data accessed via method)
        s1.addGrade(85);
        s1.addGrade(90);

        s2.addGrade(78);
        s2.addGrade(88);

        // Enroll students
        s1.enrollCourse(javaCourse);
        s2.enrollCourse(javaCourse);

        // Polymorphism demonstration
        Person p1 = s1;
        Person p2 = faculty1;

        p1.printDetails();   // Student version
        p2.printDetails();   // Faculty version
    }
}
