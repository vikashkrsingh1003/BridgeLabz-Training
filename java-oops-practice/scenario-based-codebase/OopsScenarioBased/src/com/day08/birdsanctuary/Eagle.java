package com.day08.birdsanctuary;

public class Eagle extends Bird implements Flyable{

	public Eagle(String name, int id) {
		super(name, id, "Eagle");
	}
	
	public void fly() {
		System.out.println("Bird can fly");
	}
}
