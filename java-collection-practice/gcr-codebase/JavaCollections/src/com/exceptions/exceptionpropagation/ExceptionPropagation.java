package com.exceptions.exceptionpropagation;

public class ExceptionPropagation {

    static void method1() {
        // Exception occurs here
        int result = 10 / 0;   // ArithmeticException
    }

    static void method2() {
        // No try-catch here → exception propagates
        method1();
    }

    public static void main(String[] args) {

        try {
            method2();
        } catch (ArithmeticException e) {
            System.out.println("Handled exception in main");
        }
    }
}
