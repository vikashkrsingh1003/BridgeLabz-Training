package com.objectmodel.level1.universitywithfaculties;

import java.util.ArrayList;

public class University {
    private String universityName;

    // Composition
    private ArrayList<Department> departments;

    // Aggregation
    private ArrayList<Faculty> facultyMembers;

    public University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>();
        this.facultyMembers = new ArrayList<>();
    }

    // Composition: departments created inside university
    public void addDepartment(String departmentName) {
        departments.add(new Department(departmentName));
    }

    // Aggregation: faculty passed from outside
    public void addFaculty(Faculty faculty) {
        facultyMembers.add(faculty);
    }

    public void displayUniversity() {
        System.out.println("University: " + universityName);

        System.out.println("Departments:");
        for (Department dept : departments) {
            dept.displayDepartment();
        }

        System.out.println("Faculty Members:");
        for (Faculty faculty : facultyMembers) {
            faculty.displayFaculty();
        }

        System.out.println();
    }
}
