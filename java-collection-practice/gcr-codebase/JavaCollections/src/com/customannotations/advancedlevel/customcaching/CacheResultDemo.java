package com.customannotations.advancedlevel.customcaching;

public class CacheResultDemo {
    public static void main(String[] args) {

       Calculator calc = new Calculator();

       System.out.println("Result: " + calc.square(5));
       System.out.println("Result: " + calc.square(5)); // cached
       System.out.println("Result: " + calc.square(6));
       System.out.println("Result: " + calc.square(6)); // cached
    }
}