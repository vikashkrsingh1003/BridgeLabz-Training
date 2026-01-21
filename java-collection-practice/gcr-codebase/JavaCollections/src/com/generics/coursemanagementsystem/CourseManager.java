package com.generics.coursemanagementsystem;

import java.util.List;

public class CourseManager {

	public static void evaluateAll(List<? extends CourseType> courseTypes) {
		for(CourseType c : courseTypes)
		{
			c.evaluate();
		}
	}
}
