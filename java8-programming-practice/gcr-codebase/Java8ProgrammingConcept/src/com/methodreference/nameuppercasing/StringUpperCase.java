package com.methodreference.nameuppercasing;

import java.util.ArrayList;
import java.util.List;

public class StringUpperCase {

	public static void main(String[] args) {
		
		ArrayList<Employee> employees = new ArrayList<>(List.of(new Employee(101,"saurav"),
				                                                new Employee(102,"vikash"),
				                                                new Employee(103,"himanshi"))); 
		employees.stream().map(Employee::getName)
		         .map(String::toUpperCase)
		         .forEach(System.out::println);
	}
}
