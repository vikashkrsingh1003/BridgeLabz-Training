package com.day08.birdsanctuary;

public class Bird {

	private String name;
	private int id;
	private String species;
	
	public Bird(String name, int id,String species) {
		this.name = name;
		this.id = id;
		this.species = species;
	}
	
	public int getBirdId(){
		return id;
	}
	
	public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Species: " + species);
    }
	
}
