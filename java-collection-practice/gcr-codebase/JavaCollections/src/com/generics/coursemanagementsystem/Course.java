package com.generics.coursemanagementsystem;

public class Course <T extends CourseType>{
	
    private String courseName;
    private T courseType;
    
    public Course(String courseName, T courseType) {
    	this.courseName = courseName;
    	this.courseType = courseType;
    }
    
    public void evaluateCourse() {
    	System.out.println(courseName + " : ");
    	courseType.evaluate();
    }
    
    public T getCourseType() {
    	return courseType;
    }
}
