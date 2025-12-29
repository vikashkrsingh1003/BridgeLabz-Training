package com.constructors.level1;

public class Student {
	
    public int rollNumber;
    protected String name;
    private double CGPA;

    // Constructor to initialize student details
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // getter method 
    public double getCGPA() {
        return CGPA;
    }

    //setter method 
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    //Method to display basic student details
    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

 // Subclass demonstrating use of protected member
 class PostgraduateStudent extends Student {

    private String specialization;

    //Constructor for PostgraduateStudent
    public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    //Method to display postgraduate student details
    public void displayPGStudentDetails() {

        // Accessing protected member 'name' from parent class
        System.out.println("Postgraduate Student Name: " + name);
        System.out.println("Specialization: " + specialization);
        System.out.println("CGPA: " + getCGPA());
    }


    public static void main(String[] args) {

        PostgraduateStudent pg = new PostgraduateStudent(101, "Rahul", 8.5, "Computer Science");

        // Accessing public member
        System.out.println("Roll Number: " + pg.rollNumber);

        // Using public methods to access and modify private CGPA
        pg.setCGPA(9.0);

        // Display details
        pg.displayPGStudentDetails();
    }
}
