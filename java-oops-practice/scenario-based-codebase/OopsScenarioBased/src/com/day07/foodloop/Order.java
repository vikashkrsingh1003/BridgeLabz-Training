package com.day07.foodloop;

import java.util.*;
public class Order implements IOrderable{
	
	private double total;
	ArrayList<FoodItem> items;
	
	public Order()
	{
		this.items = new ArrayList<>();
		total = 0;
	}
	
	boolean available = false;
    public void ordersItem(FoodItem f, int quantity)
	{
    	if(f.getStock()>0 && f.getStock()>=quantity) {
		items.add(f);
		f.setStock(f.getStock()-quantity);
		System.out.println(f.name + " Added");
		available = true;
		total += (f.getPrice() * quantity);
    	}
		else {
			System.out.println(f.name + " Not available");
		}
	}
    
    @Override
    public void placeOrder()
    {
    	double discount = 0.10;
    	
    	if(items.size() > 0 || available == true) {
    	System.out.println("Your order has placed!");
    	System.out.println("Total Bill is : " + (total - (total * discount)));
    	}
    	else
    	System.out.println("No item added or items are out of stock");
    	
    }
    
    @Override
    public void cancelOrder()
    {
    	System.out.println("Your order has cancelled!");
    	
    }
}
