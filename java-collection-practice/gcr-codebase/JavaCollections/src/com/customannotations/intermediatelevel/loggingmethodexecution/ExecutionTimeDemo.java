package com.customannotations.intermediatelevel.loggingmethodexecution;

import java.lang.reflect.Method;

public class ExecutionTimeDemo {
    public static void main(String[] args) throws Exception {
        PerformanceTest obj = new PerformanceTest();

        Method method = obj.getClass().getDeclaredMethod("heavyTask");

        if (method.isAnnotationPresent(LogExecutionTime.class)) {
            long start = System.nanoTime();
            method.invoke(obj);
            long end = System.nanoTime();
            System.out.println("Time: " + (end - start) + " ns");
        }
    }
}