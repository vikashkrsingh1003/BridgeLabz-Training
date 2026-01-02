package com.objectmodel.level1.studentwithcourses;

import java.util.ArrayList;

public class Course {
    private String courseCode;
    private String courseName;
    private ArrayList<Student> students;

    public Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    void addStudent(Student student) {
        students.add(student);
    }

    public void viewEnrolledStudents() {
        System.out.println("Course: " + courseName);
        for (Student student : students) {
            System.out.println(" - " + student.getName());
        }
        System.out.println();
    }

    public String getCourseName() {
        return courseName;
    }
}

