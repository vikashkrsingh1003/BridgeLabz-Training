package com.day02.universitymanagementsystem;

 public class UnderGraduate extends Student{

	     private double gpa;

	    public UnderGraduate(String enrollmentId , int enrollYear ,String name,int age,double gpa) {
	    	super(enrollmentId,enrollYear,name,age);
			this.gpa = gpa;
		}

	    @Override
	    public void displayInfo() {
	    	System.out.println("----------------------------------------------------");
	        System.out.println(getSummary() + ", gpa " + gpa);
	       
	    }
 }


