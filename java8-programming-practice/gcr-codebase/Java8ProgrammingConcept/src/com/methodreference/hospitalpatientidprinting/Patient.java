package com.methodreference.hospitalpatientidprinting;

public class Patient {

	int id;
	String name;
	
	public Patient(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	void displayId(){System.out.println("Id: " + id);}
	void displayName(){System.out.println("Name: " + name);}
}
