package com.objectmodel.level1.universitywithfaculties;


 import java.util.ArrayList;

public class Department {
    private String departmentName;

    // Departments are created and owned by University
    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    public void displayDepartment() {
        System.out.println("Department: " + departmentName);
    }

    public String getDepartmentName() {
        return departmentName;
    }
}
