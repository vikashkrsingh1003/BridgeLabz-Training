package com.constructors.level1;

public class Person {
	    private String name;
	    private int age;

	    // Parameterized constructor
	    public Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    //Copy constructor
	    public Person(Person other) {
	        this.name = other.name;
	        this.age = other.age;
	    }

	    //Display method
	    public void display() {
	        System.out.println(" Name: " + name + ", Age: " + age);
	    }

	   
	    public static void main(String[] args) {
	        Person p1 = new Person("Alice", 20);
	        Person p2 = new Person(p1); // cloning p1

	        System.out.println("Original Person:");
	        p1.display();

	        System.out.println("\nCloned Person:");
	        p2.display();
	    }
}
