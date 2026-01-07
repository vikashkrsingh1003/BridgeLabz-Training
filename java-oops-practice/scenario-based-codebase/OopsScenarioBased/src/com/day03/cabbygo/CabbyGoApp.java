package com.day03.cabbygo;

import java.util.Scanner;

public class CabbyGoApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Driver input
        System.out.print("Enter Driver Name: ");
        String name = sc.nextLine();

        System.out.print("Enter License Number: ");
        String license = sc.nextLine();

        System.out.print("Enter Driver Rating: ");
        double rating = sc.nextDouble();

        sc.nextLine();
        Driver driver = new Driver(name, license, rating);

        // Vehicle input
        System.out.println("\nSelect Vehicle Type:");
        System.out.println("1. Mini\n2. Sedan\n3. SUV");
        int choice = sc.nextInt();

        sc.nextLine();
        System.out.print("Enter Vehicle Number: ");
        String vehicleNo = sc.nextLine();

        Vehicle vehicle = null;

        if (choice == 1)
            vehicle = new Mini(vehicleNo);
        else if (choice == 2)
            vehicle = new Sedan(vehicleNo);
        else if (choice == 3)
            vehicle = new SUV(vehicleNo);
        else {
            System.out.println("Invalid choice");
            System.exit(0);
        }

        System.out.print("Enter Distance (km): ");
        double distance = sc.nextDouble();

        IRideService ride = new RideService(vehicle, driver);
        ride.bookRide(distance);
        ride.endRide();

        sc.close();
    }
}

