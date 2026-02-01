package com.reflection.advancedlevel;

public class Car {
	@Inject
	Engine engine;


	void drive() {
	engine.start();
	System.out.println("Car running");
	}
	}