package com.inheritance.multilevelinheritance.coursehierarchy;

public class Main {
    public static void main(String[] args) {

        Course basicCourse = new Course("Mathematics", 12);
        OnlineCourse onlineCourse = new OnlineCourse("Physics", 10, "Zoom", true);
        PaidOnlineCourse paidCourse = new PaidOnlineCourse("Java Programming", 8, "Udemy", true, 200, 20);

        System.out.println("=== Basic Course ===");
        basicCourse.displayInfo();
        System.out.println("\n=== Online Course ===");
        onlineCourse.displayInfo();
        System.out.println("\n=== Paid Online Course ===");
        paidCourse.displayInfo();
    }
}
