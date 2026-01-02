package com.objectmodel.level1.companyanddepartment;

import java.util.ArrayList;

public class Company {
    private String companyName;
    private ArrayList<Department> departments;

    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    // Departments are created inside Company (composition)
    public void addDepartment(String departmentName) {
        departments.add(new Department(departmentName));
    }

    public Department getDepartment(String departmentName) {
        for (Department dept : departments) {
            if (dept.getDepartmentName().equals(departmentName)) {
                return dept;
            }
        }
        return null;
    }

    public void displayCompany() {
        System.out.println("Company: " + companyName);
        for (Department dept : departments) {
            dept.displayDepartment();
            System.out.println();
        }
    }
}

