package com.day02.universitymanagementsystem;

public class Faculty {
     
	protected int employeeId;
	protected String name;
	protected String subject;
	
	public Faculty(int employeeId , String name , String subject){
		this.employeeId = employeeId;
		this.name = name;
		this.subject = subject;
		
	}

	    public void displayInfo() {
	    	System.out.println("----------------------------------------------------");
	        System.out.println("Employee Id: "+ employeeId +" name : " +name+ ", Subject " + subject);
	       
	  }
}
