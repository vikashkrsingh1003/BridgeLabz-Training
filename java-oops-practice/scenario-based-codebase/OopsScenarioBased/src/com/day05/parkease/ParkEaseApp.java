package com.day05.parkease;

import java.util.Scanner;

public class ParkEaseApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ParkingManager manager = new ParkingManager();

        System.out.print("Enter Vehicle Type (car/bike/truck): ");
        String type = sc.nextLine();

        System.out.print("Enter Vehicle Number: ");
        String number = sc.nextLine();

        System.out.print("Enter Parking Duration (hours): ");
        int hours = sc.nextInt();

        Vehicle vehicle;
        String allowedType;

        switch (type.toLowerCase()) {
            case "bike":
                vehicle = new Bike(number);
                allowedType = "bike";
                break;
            case "truck":
                vehicle = new Truck(number);
                allowedType = "truck";
                break;
            default:
                vehicle = new Car(number);
                allowedType = "car";
        }

        ParkingSlot slot = new ParkingSlot("S1", "City Center", allowedType);

        if (slot.isAvailable() && slot.assignSlot()) {

            double charges = vehicle.calculateCharges(hours);

            manager.logBooking(
                    vehicle.getVehicleNumber() +
                    " parked at " + slot.getSlotDetails() +
                    " | Charges: " + charges
            );

            System.out.println("\nParking Assigned Successfully!");
            System.out.println("Total Charges: " + charges);

            slot.releaseSlot();
        } else {
            System.out.println("Parking Slot Not Available!");
        }

        manager.showLogs();
        sc.close();
    }
}

