package com.day04.petpal;

import java.util.Scanner;
public class PetPalApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Welcome to PetPal – Virtual Pet Care App ");
        System.out.print("Enter pet name: ");
        String name = sc.nextLine();
         
        System.out.print("Enter pet age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Choose pet type (Dog / Cat / Bird): ");
        String type = sc.nextLine().toLowerCase();
        Pet pet;

        switch (type) {
            case "dog":
                pet = new Dog(name, age);
                break;
            case "cat":
                pet = new Cat(name, age);
                break;
            case "bird":
                pet = new Bird(name, age);
                break;
            default:
                System.out.println("please chooser valid pet types");
                pet = new Dog(name, age);
        }

        System.out.println("\n You adopted " + name + "\n");
        boolean running = true;
        while (running) {
            System.out.println("What would you like to do?");
            System.out.println("1. Feed");
            System.out.println("2. Play");
            System.out.println("3. Sleep");
            System.out.println("4. Hear Sound");
            System.out.println("5. Show Status");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    pet.feed();
                    System.out.println("You fed " + name);
                    break;
                case 2:
                    pet.play();
                    System.out.println("You played with " + name);
                    break;
                case 3:
                    pet.sleep();
                    System.out.println(name + " is sleeping...");
                    break;
                case 4:
                    pet.makeSound();
                    break;
                case 5:
                    pet.showStatus();
                    break;
                case 6:
                    running = false;
                    System.out.println("Thanks for using PetPal!");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }

        sc.close();
    }
}
