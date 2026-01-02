package com.inheritance.hierarchicalinheritance.schoolsystem;


public class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayRole() {
        System.out.println("This is a person.");
    }
}

