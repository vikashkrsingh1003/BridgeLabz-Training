package com.generics.coursemanagementsystem;

public class AssignmentCourse extends CourseType{

	public AssignmentCourse() {
		super("Assignment Based");
	}
	
	@Override
	public void evaluate() {
		System.out.println("Evaluated using Assignments");
	}
}
