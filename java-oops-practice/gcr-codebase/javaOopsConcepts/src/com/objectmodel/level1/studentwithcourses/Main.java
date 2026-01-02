package com.objectmodel.level1.studentwithcourses;

public class Main {
    public static void main(String[] args) {

        // School
        School school = new School("Green Valley High School");

        // Students (independent objects → aggregation)
        Student s1 = new Student(1, "Alice");
        Student s2 = new Student(2, "Bob");

        school.addStudent(s1);
        school.addStudent(s2);

        // Courses
        Course math = new Course("M101", "Mathematics");
        Course science = new Course("S101", "Science");

        // Many-to-many association
        s1.enrollCourse(math);
        s1.enrollCourse(science);
        s2.enrollCourse(math);

        // View relationships
        s1.viewCourses();
        s2.viewCourses();

        math.viewEnrolledStudents();
        science.viewEnrolledStudents();
    }
}

