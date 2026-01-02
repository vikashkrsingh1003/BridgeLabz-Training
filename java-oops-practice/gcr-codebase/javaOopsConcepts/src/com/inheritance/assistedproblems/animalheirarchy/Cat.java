package com.inheritance.assistedproblems.animalheirarchy;

public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    // Method overriding
    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow!");
    }
}