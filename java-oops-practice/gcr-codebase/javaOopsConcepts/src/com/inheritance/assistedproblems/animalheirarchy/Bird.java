package com.inheritance.assistedproblems.animalheirarchy;

public class Bird extends Animal {

    public Bird(String name, int age) {
        super(name, age);
    }

    // Method overriding
    @Override
    public void makeSound() {
        System.out.println(name + " says: Tweet!");
    }
}

