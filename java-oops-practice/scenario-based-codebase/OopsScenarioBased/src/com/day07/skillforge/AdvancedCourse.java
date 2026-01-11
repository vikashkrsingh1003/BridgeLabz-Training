package com.day07.skillforge;

public class AdvancedCourse extends Course{

	public AdvancedCourse(String title, Instructor instructor) {
        super(title, instructor);
    }

    public void generateCertificate(Student s) {
        System.out.println("Advanced Certificate with Grade awarded to " + s.name);
    }
}
