package com.inheritance.assistedproblems.animalheirarchy;

public class Main {
    public static void main(String[] args) {

    	//create a object of all the classes
        Animal dog = new Dog("Buddy", 3);
        Animal cat = new Cat("Whiskers", 2);
        Animal bird = new Bird("Tweety", 1);

        //called the all class 
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }
}
