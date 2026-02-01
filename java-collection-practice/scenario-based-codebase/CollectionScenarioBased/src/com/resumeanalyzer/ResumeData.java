package com.resumeanalyzer;

public class ResumeData {

	String email;
    String phone;
	int keywordCount;
	
	public void display() {
		System.out.println("Email " + email);
		System.out.println("phone " + phone);
		System.out.println("Count " + keywordCount);
		System.out.println("------------------------------");
	}
}
