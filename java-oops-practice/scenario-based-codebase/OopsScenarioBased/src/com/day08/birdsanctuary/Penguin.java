package com.day08.birdsanctuary;

public class Penguin extends Bird implements Swimmable{

	public Penguin(String name, int id) {
		super(name, id, "Penguin");
	}
	
	public void swim() {
		System.out.println("Bird can Swim");
	}
	
}
