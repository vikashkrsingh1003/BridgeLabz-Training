package com.generics.onlinemarketplace;

public abstract class Category {

	private String name;
	private double minPrice;
	private double maxPrice;
	
	public Category(String name , double minPrice, double maxPrice)
	{
		this.maxPrice = maxPrice;
		this.minPrice = minPrice;
		this.name = name;
	}
	
	public String getName() {return name;}
	
	public boolean isValidPrice(double price) {
        return price >= minPrice && price <= maxPrice;
    }
}
