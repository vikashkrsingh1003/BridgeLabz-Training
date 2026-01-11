package com.day07.foodloop;

public class FoodItem {

	protected String name;
	protected String category;
	private double price;
	protected boolean availability;
	private int stock;
	
	public FoodItem(String name, String category, double price, boolean availability, int stock) {
		this.name = name;
		this.category = category;
		this.price = price;
		this.stock = stock;
		this.availability = availability;
	}
	public double getPrice() {return price;}
	public int getStock() {return stock;}
	public void setStock(int stock) {this.stock = stock;}
}
