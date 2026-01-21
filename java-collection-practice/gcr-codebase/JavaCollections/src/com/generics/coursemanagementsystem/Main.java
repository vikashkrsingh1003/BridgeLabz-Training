package com.generics.coursemanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Course<ExamCourse> c1 =
                new Course<>("Data Structures", new ExamCourse());

        Course<AssignmentCourse> c2 =
                new Course<>("Web Development", new AssignmentCourse());

        Course<ResearchCourse> c3 =
                new Course<>("AI Research", new ResearchCourse());

        c1.evaluateCourse();
        c2.evaluateCourse();
        c3.evaluateCourse();

        List<CourseType> list = new ArrayList<>();
        list.add(new ExamCourse());
        list.add(new AssignmentCourse());
        list.add(new ResearchCourse());

        CourseManager.evaluateAll(list);
	}

}
