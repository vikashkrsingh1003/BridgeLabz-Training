package com.constructors.level1;

public class CarRental {
	
	private String customerName;
    private String carModel;
    private int rentalDays;
    private double costPerDay = 50.0;

    //Constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Method to calculate total cost
    public double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    //Method to display rental details
    public void displayRentalDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: $" + calculateTotalCost());
    }

    public static void main(String args[]) {
    	// Car Rental System Test
        CarRental rental1 = new CarRental("Alex", "Toyota Camry", 3);
        rental1.displayRentalDetails();
    }
 }
