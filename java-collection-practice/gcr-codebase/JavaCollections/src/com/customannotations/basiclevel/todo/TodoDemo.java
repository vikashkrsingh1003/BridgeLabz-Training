package com.customannotations.basiclevel.todo;

import java.lang.reflect.Method;

public class TodoDemo {
    public static void main(String[] args) {
        for (Method m : Project.class.getDeclaredMethods()) {
            if (m.isAnnotationPresent(Todo.class)) {
                Todo t = m.getAnnotation(Todo.class);
                System.out.println(t.task() + " | " + t.assignedTo()
                        + " | " + t.priority());
            }
        }
    }
}