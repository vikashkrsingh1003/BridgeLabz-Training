package com.springcore.ciexample;

public class Student {

    private int id;
    private String name;
    private Address address;

    public Student(int id, String name, Address address) {

        this.id = id;
        this.name = name;
        this.address = address;
      
    }

    public void show() {
      
        System.out.println(id);
        System.out.println(name);
        
        address.display();

    }

}