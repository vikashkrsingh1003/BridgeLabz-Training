package com.inheritance.assistedproblems.animalheirarchy;

public class Dog extends Animal {
	
      
	 public Dog(String name, int age) {
	        super(name, age);
	    }

	    // Method overriding
	    @Override
	    public void makeSound() {
	    	 System.out.println(name + " says: Woof!");

	    }  
	 }
