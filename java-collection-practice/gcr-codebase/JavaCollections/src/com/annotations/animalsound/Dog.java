package com.annotations.animalsound;

public class Dog extends Animal{
	
	public Dog(String animalName) {
		super(animalName);
	}

	@Override
	public void makeSound() {
	System.out.println("Dog barks");
	}
}
