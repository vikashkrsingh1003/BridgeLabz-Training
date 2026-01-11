package com.day07.skillforge;

public class BeginnerCourse extends Course{

	public BeginnerCourse(String title, Instructor instructor) {
        super(title, instructor);
    }

    public void generateCertificate(Student s) {
        System.out.println("Beginner Certificate awarded to " + s.name);
    }
}
