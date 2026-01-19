package com.day08.birdsanctuary;

public class Duck extends Bird implements Flyable, Swimmable{

	public Duck(String name, int id) {
		super(name, id, "duck");
	}
	
	public void fly() {
		System.out.println("Bird can fly");
	}
	
	public void swim() {
		System.out.println("Bird can Swim");
	}
}
