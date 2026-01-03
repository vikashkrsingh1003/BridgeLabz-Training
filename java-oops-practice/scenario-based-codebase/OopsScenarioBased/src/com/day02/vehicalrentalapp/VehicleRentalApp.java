package com.day02.vehicalrentalapp;

public class VehicleRentalApp {
	
	    public static void main(String[] args) {

	        Vehicle bike = new Bike("B101", "Yamaha");
	        Vehicle car = new Car("C202", "Toyota");
	        Vehicle truck = new Truck("T303", "Volvo");

	        Customer customer = new Customer("vishal");

	        customer.rentVehicle(bike, 3);
	        customer.rentVehicle(car, 5);
	        customer.rentVehicle(truck, 2);
	    }
	}


