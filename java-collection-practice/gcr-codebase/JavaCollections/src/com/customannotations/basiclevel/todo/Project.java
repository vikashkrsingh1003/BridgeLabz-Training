package com.customannotations.basiclevel.todo;

public class Project {

    @Todo(task = "Add login", assignedTo = "Aman")
    void loginFeature() {}

    @Todo(task = "Optimize DB", assignedTo = "Rajeev", priority = "HIGH")
    void optimize() {}
}