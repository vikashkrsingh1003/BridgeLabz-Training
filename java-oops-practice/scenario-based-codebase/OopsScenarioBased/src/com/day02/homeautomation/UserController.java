package com.day02.homeautomation;

import java.util.Scanner;

public class UserController {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter Light energy usage: ");
        Light light = new Light(sc.nextDouble());

        System.out.print("Enter Fan energy usage: ");
        Fan fan = new Fan(sc.nextDouble());

        System.out.print("Enter AC energy usage: ");
        AC ac = new AC(sc.nextDouble());

        // Polymorphism
        Controllable[] devices = { light, fan, ac };

        System.out.println("\nTurning ON all devices:");
        for (Controllable device : devices) {
            device.turnOn();
        }

        // Operators (>, <, ==)
        System.out.println("\nEnergy Usage Comparison:");
        if (ac.getEnergyUsage() > fan.getEnergyUsage()) {
            System.out.println("AC consumes more energy than Fan");
        }

        if (light.getEnergyUsage() < fan.getEnergyUsage()) {
            System.out.println("Light consumes less energy than Fan");
        }

        if (fan.getEnergyUsage() == light.getEnergyUsage()) {
            System.out.println("Fan and Light consume equal energy");
        }

        sc.close();
    }
}
