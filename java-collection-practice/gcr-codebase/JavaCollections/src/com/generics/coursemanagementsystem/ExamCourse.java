package com.generics.coursemanagementsystem;

public class ExamCourse extends CourseType{

	public ExamCourse() {
		super("Exam-Based");
	}
	
	@Override
	public void evaluate() {
		System.out.println("Evaluated using written exams");
	}
}
