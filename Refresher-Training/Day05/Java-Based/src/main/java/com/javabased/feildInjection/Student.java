package com.javabased.feildInjection;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	

    @Autowired
    private Address address;

    public void display() {
    	
        System.out.println(address);
    }
}