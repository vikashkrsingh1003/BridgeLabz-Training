package com.day03.campusconnect;

import java.util.ArrayList;

public class Student extends Person implements ICourseActions {

    private ArrayList<Integer> grades = new ArrayList<>(); // private as required
    private ArrayList<Course> courses = new ArrayList<>();

    public Student(int id, String name, String email) {
        super(id, name, email);
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    // Operator usage via arithmetic
    public double calculateGPA() {
        int sum = 0;
        for (int g : grades) sum += g;
        return grades.size() == 0 ? 0 : (double) sum / grades.size();
    }

    @Override
    public void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
    }

    @Override
    public void dropCourse(Course course) {
        courses.remove(course);
        course.removeStudent(this);
    }

    @Override
    public void printDetails() {
        System.out.println("Student: " + name + ", GPA: " + calculateGPA());
    }
}

