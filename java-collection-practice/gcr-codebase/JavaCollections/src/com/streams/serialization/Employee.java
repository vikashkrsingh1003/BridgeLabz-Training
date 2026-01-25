package com.streams.serialization;

import java.io.*;

public class Employee implements Serializable{

	private int id;
	private String name;
	private String department;
	private int salary;
	
	public Employee(int id, String name, String department, int salary) {
		this.department = department;
		this.id = id;
		this.name = name;
		this.salary  = salary;
	}
	
	@Override
	public String toString() {
		 return "Employee{name='" + name + "', id=" + id + "}";
	}
}
