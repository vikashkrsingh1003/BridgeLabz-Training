package com.constructors.level1;

public class Vehicle {
	
	// Instance variables
    private String ownerName;
    private String vehicleType;

    //Class variable 
    private static double registrationFee = 500.0;

    //Constructor to initialize vehicle details
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }

    //Class method to update registration fee for all vehicles
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {

        // Creating vehicle objects
        Vehicle v1 = new Vehicle("rahul", "Car");
        Vehicle v2 = new Vehicle("sanju", "Motorcycle");

        //Display vehicle details before fee update
        v1.displayVehicleDetails();
        System.out.println();
        v2.displayVehicleDetails();

        System.out.println("\nUpdating Registration Fee...\n");

        // Update registration fee using class method
        Vehicle.updateRegistrationFee(650.0);

        // Display vehicle details after fee update
        v1.displayVehicleDetails();
        System.out.println();
        v2.displayVehicleDetails();
    }
}
