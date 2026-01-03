package com.day02.universitymanagementsystem;

public class Postgraduate extends Student {

    private double gpa;
    protected String pgCourse;

    public Postgraduate(String enrollmentId , int enrollYear, String name, int age, double gpa, String pgCourse) {
        super(enrollmentId , enrollYear ,name, age);
        this.gpa = gpa;
        this.pgCourse = pgCourse;
    }

    @Override
    public void displayInfo() {
        System.out.println("----------------------------------------------------");
        System.out.println( getSummary() +  ", GPA: " + gpa + ", Post Graduate Course: " + pgCourse);
    }
}
