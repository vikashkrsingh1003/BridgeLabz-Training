package com.day07.foodloop;

public class VegItem extends FoodItem{

	public VegItem(String name, double price, boolean availability, int stock) {
		super(name, "Veg item", price, true, stock);
	}
}
