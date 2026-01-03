package com.day02.universitymanagementsystem;

public class Enrollment {
    
	protected String enrollmentId;
	protected int enrollYear;
	
	public Enrollment(String enrollmentId , int enrollYear) {
		this.enrollmentId = enrollmentId;
		this.enrollYear = enrollYear;
		
	}
	 public void displayInfo() {
	    	System.out.println("----------------------------------------------------");
	        System.out.println( "ENroll year : "+enrollYear + ", Enrollment " + enrollmentId);
	       
	    }
}
