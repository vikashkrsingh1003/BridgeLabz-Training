package com.constructors.level1;

public class Circle {

	    private double radius;

	    // Default constructor
	    public Circle() {
	        this(1.0); 
	    }

	    // Parameterized constructor
	    public Circle(double radius) {
	        this.radius = radius;
	    }

	    public double getRadius() {
	        return radius;
	    }

	    public double getArea() {
	        return Math.PI * radius * radius;
	    }

	    public static void main(String[] args) {
	    	
	        // Using default constructor
	        Circle c1 = new Circle();
	        System.out.println("Radius of c1: " + c1.getRadius());
	        System.out.println("Area of c1: " + c1.getArea());

	        //Using parameterized constructor
	        Circle c2 = new Circle(5.0);
	        System.out.println("\nRadius of c2: " + c2.getRadius());
	        System.out.println("Area of c2: " + c2.getArea());
	    }
	}



