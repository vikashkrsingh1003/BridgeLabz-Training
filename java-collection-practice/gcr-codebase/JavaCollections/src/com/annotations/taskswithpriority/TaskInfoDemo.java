package com.annotations.taskswithpriority;

import java.lang.reflect.Method;

public class TaskInfoDemo {
    public static void main(String[] args) throws Exception {
        Method method =
                TaskManager.class.getDeclaredMethod("completeAssignment");

        TaskInfo info = method.getAnnotation(TaskInfo.class);

        System.out.println("Priority: " + info.priority());
        System.out.println("Assigned To: " + info.assignedTo());
    }
}