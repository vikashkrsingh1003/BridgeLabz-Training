package com.day07.foodloop;

public class NonVegItem extends FoodItem{

	public NonVegItem(String name, double price, boolean availability, int stock) {
		super(name, "Non-Veg item", price, true, stock);
	}
}
