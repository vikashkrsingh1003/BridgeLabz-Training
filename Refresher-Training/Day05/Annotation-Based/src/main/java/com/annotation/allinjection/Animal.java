package com.annotation.allinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Animal {
	 
	@Autowired
    private Food food;

   //constructor injection 
//    @Autowired
//    public Animal(Food food) {
//        this.food = food;
//    }
    
    //setter injection 
//    @Autowired
//    public void setFood(Food food) {
//        this.food = food;
//    }
//    
     

    public void display() {
        System.out.println("Animal : Cow");
        System.out.println("Food : " + food);
    }
}