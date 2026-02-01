package com.reflection.intermediatelevel;

import java.lang.reflect.Method;
import java.util.Scanner;

public class DynamicInvokeDemo {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Method name: ");
        String methodName = sc.next();

        MathOperations obj = new MathOperations();

        Method method = MathOperations.class
                .getMethod(methodName, int.class, int.class);

        Object result = method.invoke(obj, 10, 5);
        System.out.println("Result: " + result);
        
        sc.close();
    }
}