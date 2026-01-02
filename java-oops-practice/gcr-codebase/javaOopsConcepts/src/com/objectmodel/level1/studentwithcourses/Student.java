package com.objectmodel.level1.studentwithcourses;

import java.util.ArrayList;

public class Student {
    private int studentId;
    private String name;
    private ArrayList<Course> courses;

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.courses = new ArrayList<>();
    }

    // Association: student enrolls in a course
    public void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
    }

    public void viewCourses() {
        System.out.println("Student: " + name);
        for (Course course : courses) {
            System.out.println(" - " + course.getCourseName());
        }
        System.out.println();
    }

    public String getName() {
        return name;
    }
}

