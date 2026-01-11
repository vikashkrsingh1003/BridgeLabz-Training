package com.day07.skillforge;

public class Student extends User implements ICertifiable{

	 private int progress;   // percentage
	    private int grade;

	    public Student(String name, String email) {
	        super(name, email);
	        this.progress = 0;
	        this.grade = 0;
	    }

	    public void updateProgress(int completedModules, int totalModules) {
	        progress = (completedModules * 100) / totalModules; // operator usage
	    }

	    public void updateGrade(int score, int total) {
	        grade = (score * 100) / total;
	    }

	    @Override
	    public void generateCertificate() {
	        System.out.println("Certificate generated for " + name);
	    }
}
