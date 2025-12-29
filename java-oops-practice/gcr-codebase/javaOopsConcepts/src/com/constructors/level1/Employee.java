package com.constructors.level1;

public class Employee {
	
	    public int employeeID;
        protected String department;
	    private double salary;

	    // Constructor to initialize employee details
	    public Employee(int employeeID, String department, double salary) {
	        this.employeeID = employeeID;
	        this.department = department;
	        this.salary = salary;
	    }

	    //Public method to modify private salary
	    public void setSalary(double salary) {
	        this.salary = salary;
	    }

	    //Public method to access private salary
	    public double getSalary() {
	        return salary;
	    }

	    // Method to display employee details
	    public void displayEmployeeDetails() {
	        System.out.println("Employee ID: " + employeeID);
	        System.out.println("Department: " + department);
	        System.out.println("Salary: " + salary);
	    }
	}

	class Manager extends Employee {

	    private String role;

	    // Constructor for Manager
	    public Manager(int employeeID, String department, double salary, String role) {
	        super(employeeID, department, salary);
	        this.role = role;
	    }

	    // Method to demonstrate access modifiers
	    public void displayManagerDetails() {

	        System.out.println("Employee ID: " + employeeID);
	        System.out.println("Department: " + department);
	        System.out.println("Salary: " + getSalary());
	        System.out.println("Role: " + role);
	    }


	    public static void main(String[] args) {

	        Manager manager = new Manager(201, "IT", 75000, "Project Manager");

	       
	        manager.setSalary(80000);

	        //Display manager details
	        manager.displayManagerDetails();
	    }
	}

