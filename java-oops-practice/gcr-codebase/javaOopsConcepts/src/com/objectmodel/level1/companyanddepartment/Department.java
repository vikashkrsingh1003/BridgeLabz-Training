package com.objectmodel.level1.companyanddepartment;

import java.util.ArrayList;

public class Department {
    private String departmentName;
    private ArrayList<Employee> employees;

    // Employees are created inside Department (composition)
    public String getDepartmentName() {
        return departmentName;
    }

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(String name, int id) {
        employees.add(new Employee(name, id));
    }

    public void displayDepartment() {
        System.out.println("Department: " + departmentName);
        for (Employee emp : employees) {
            emp.displayEmployee();
        }
    }
}

