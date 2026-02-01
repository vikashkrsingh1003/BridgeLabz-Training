package com.lambdaexpressions.nameuppercasing;

import java.util.*;

public class NameUpperCase {

    public static void main(String[] args) {

        List<String> employeeNames = Arrays.asList("Amit", "Neha", "Rahul", "Priya");

        List<String> upperCaseNames = employeeNames.stream().map(String::toUpperCase).toList();  

        employeeNames.forEach(System.out::println);        
        upperCaseNames.forEach(System.out::println);
    }
}
