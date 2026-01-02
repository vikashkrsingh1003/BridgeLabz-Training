package com.objectmodel.level1.companyanddepartment;

public class Employee {
    private String name;
    private int employeeId;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public void displayEmployee() {
        System.out.println("Employee ID: " + employeeId + ", Name: " + name);
    }
}
