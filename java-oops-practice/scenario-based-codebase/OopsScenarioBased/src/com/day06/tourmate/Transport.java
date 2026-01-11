package com.day06.tourmate;

public class Transport {
	 private String mode;
	    private double cost;

	    public Transport(String mode, double cost) {
	        this.mode = mode;
	        this.cost = cost;
	    }

	    double getCost() { 
	        return cost;
	    }

}
