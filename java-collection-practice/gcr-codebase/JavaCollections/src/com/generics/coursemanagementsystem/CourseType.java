package com.generics.coursemanagementsystem;

public abstract class CourseType {

	protected String evaluationType;
	
	public CourseType(String evaluationType) {
		this.evaluationType = evaluationType;
	}
	
	public String getEvaluation() {
		return evaluationType;
	}
	
	public abstract void evaluate();
}
