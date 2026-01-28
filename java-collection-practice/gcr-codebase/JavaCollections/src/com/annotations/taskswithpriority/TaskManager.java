package com.annotations.taskswithpriority;

public class TaskManager {

    @TaskInfo(priority = "HIGH", assignedTo = "Rajeev")
    void completeAssignment() {
        System.out.println("Assignment completed");
    }
}