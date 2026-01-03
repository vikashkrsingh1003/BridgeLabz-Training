package com.day02.universitymanagementsystem;

public class Course {
      
	protected int courseId;
	protected String name;
	protected int duration; //duration in month
	
	public Course(int courrseId , String name, int duration) {
		this.courseId = courseId ;
		this.duration = duration;
		this.name = name;
		
	}
}
