package com.day02.universitymanagementsystem;

public class Student extends Enrollment {
   
	protected String name;
	protected int age;
	
	
	public Student(String enrollmentId , int enrollYear , String name, int age ) {
		super(enrollmentId,enrollYear);

		this.name = name;
		this.age = age;
	}
	 
	public String getSummary() {
        return  "EnrollmentId :" + enrollmentId + " Enrollment Year:  "+ enrollYear  + " , Student Name: " + name + " Student age : "+ age  ;
    }
	
    public void displayInfo() {
        System.out.println(getSummary());
    }
	
}
