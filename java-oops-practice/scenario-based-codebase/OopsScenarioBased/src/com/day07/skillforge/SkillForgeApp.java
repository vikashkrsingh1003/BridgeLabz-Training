package com.day07.skillforge;

public class SkillForgeApp {

	public static void main(String[] args) {
		
		Instructor inst = new Instructor("Amit", "amit@skillforge.com");
        Student st = new Student("vikash", "vksinghj@mail.com");

        Course c1 = new BeginnerCourse("Java Basics", inst);
        Course c2 = new AdvancedCourse("Spring Boot", inst);

        st.updateProgress(3, 3);
        st.generateCertificate();

	}

}
