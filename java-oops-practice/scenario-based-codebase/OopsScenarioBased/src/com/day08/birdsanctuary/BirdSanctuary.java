package com.day08.birdsanctuary;

import java.util.ArrayList;

public class BirdSanctuary {

	private ArrayList<Bird> birdsList;
	
	public BirdSanctuary() {this.birdsList = new ArrayList<>();}
	
	public void addBird(Bird b)
	{
		birdsList.add(b);
	}
	
	public void removeBird(int BirdId)
	{
		for(Bird bird : birdsList) {
			if(bird.getBirdId() == BirdId) {
				birdsList.remove(bird);
			}		
		}
	}
	
	public void displayBirdInfo() {
		for(Bird bird : birdsList) {
			bird.display();
			
			if (bird instanceof Flyable) {
	            ((Flyable) bird).fly();
	        }

	        if (bird instanceof Swimmable) {
	            ((Swimmable) bird).swim();
	        }
		}
	}
	
	 public void report() {
	        int fly = 0, swim = 0, both = 0, neither = 0;

	        for (Bird b : birdsList) {
	            boolean f = b instanceof Flyable;
	            boolean s = b instanceof Swimmable;

	            if (f && s) both++;
	            else if (f) fly++;
	            else if (s) swim++;
	            else neither++;
	        }

	        System.out.println("Flyable: " + fly);
	        System.out.println("Swimmable: " + swim);
	        System.out.println("Both: " + both);
	        System.out.println("Neither: " + neither);
	  }
	 
	 public void displayFlyingBirds() {
		    for (Bird b : birdsList) {
		        if (b instanceof Flyable) {
		            b.display();
		            ((Flyable) b).fly();
		        }
		    }
	  }
	 
	 public void displaySwimmingBirds() {
		    for (Bird b : birdsList) {
		        if (b instanceof Swimmable) {
		            b.display();
		            ((Swimmable) b).swim();
		        }
		    }
	  }
	 
	 public void displayBothFlyingAndSwimmingBirds() {
		    for (Bird b : birdsList) {
		        if (b instanceof Flyable && b instanceof Swimmable) {
		            b.display();
		            ((Flyable) b).fly();
		            ((Swimmable) b).swim();
		        }
		    }
	 }
}
