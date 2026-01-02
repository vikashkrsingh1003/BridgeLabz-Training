package com.objectmodel.level1.companyanddepartment;

public class Main {
    public static void main(String[] args) {

        Company company = new Company("Tech Solutions");

        company.addDepartment("IT");
        company.addDepartment("HR");

        company.getDepartment("IT").addEmployee("Alice", 101);
        company.getDepartment("IT").addEmployee("Bob", 102);
        company.getDepartment("HR").addEmployee("Carol", 201);

        company.displayCompany();

        // Composition effect:
        // When company reference is removed, departments and employees are also removed
        company = null;

        System.out.println("Company deleted. All departments and employees are removed.");
    }
}
