package com.constructors.level1;

public class Course {
	
	    //Instance variables 
	    private String courseName;
	    private int duration; // duration in months
	    private double fee;

	    //Class variable 
	    private static String instituteName = "ABC Institute";

	    //Constructor to initialize course details
	    public Course(String courseName, int duration, double fee) {
	        this.courseName = courseName;
	        this.duration = duration;
	        this.fee = fee;
	    }

	    // Instance method to display course details
	    public void displayCourseDetails() {
	        System.out.println("Institute Name: " + instituteName);
	        System.out.println("Course Name: " + courseName);
	        System.out.println("Duration: " + duration + " months");
	        System.out.println("Fee: " + fee);
	    }

	    // Class method to update institute name for all courses
	    public static void updateInstituteName(String newInstituteName) {
	        instituteName = newInstituteName;
	    }

	
	    public static void main(String[] args) {

	        //Creating course objects
	        Course c1 = new Course("Java Programming", 6, 1200);
	        Course c2 = new Course("Web Development", 4, 900);

	        // Display course details before updating institute name
	        c1.displayCourseDetails();
	        System.out.println();
	        c2.displayCourseDetails();

	        System.out.println("\nUpdating Institute Name...\n");

	        // Update institute name using class method
	        Course.updateInstituteName("Tit Tech Academy");

	        // Display course details after updating institute name
	        c1.displayCourseDetails();
	        System.out.println();
	        c2.displayCourseDetails();
	    }
	}

