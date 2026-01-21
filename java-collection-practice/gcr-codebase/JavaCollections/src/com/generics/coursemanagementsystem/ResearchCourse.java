package com.generics.coursemanagementsystem;

public class ResearchCourse extends CourseType{

	public ResearchCourse() {
		super("Reserach-Based");
	}
	
	@Override
	public void evaluate() {
		System.out.println("Evaluated using Research papers");
	}
}
