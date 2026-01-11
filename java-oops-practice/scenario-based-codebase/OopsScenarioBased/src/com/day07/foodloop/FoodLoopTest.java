package com.day07.foodloop;

public class FoodLoopTest {

	 public static void main(String[] args) {

	        VegItem v1 = new VegItem("Paneer", 100, true, 10);
	        NonVegItem v2 = new NonVegItem("Chicken curry", 200, true, 5);

	        Order o1 = new Order();

	        o1.ordersItem(v1, 2);
	        o1.ordersItem(v2, 1);
	        o1.placeOrder();
	        System.out.println("---------------------");
	        o1.cancelOrder();
	    }
	
}
