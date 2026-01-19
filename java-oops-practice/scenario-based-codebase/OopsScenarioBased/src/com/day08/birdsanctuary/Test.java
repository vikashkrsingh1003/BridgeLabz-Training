package com.day08.birdsanctuary;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        BirdSanctuary b = new BirdSanctuary();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println(
                "Welcome to EcoWing Bird Sanctuary\n" +
                "1. Add Bird\n" +
                "2. Display All Birds\n" +
                "3. Display All Flying Birds\n" +
                "4. Display All Swimming Birds\n" +
                "5. Display Both Flying & Swimming Birds\n" +
                "6. Delete Bird by ID\n" +
                "7. Sanctuary Report\n" +
                "8. Exit"
            );

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {

                case 1:
                    System.out.print("Enter bird name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter bird species: ");
                    String species = sc.nextLine();

                    System.out.print("Enter bird id: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    if (species.equalsIgnoreCase("Eagle")) {
                        b.addBird(new Eagle(name, id));
                    } else if (species.equalsIgnoreCase("Duck")) {
                        b.addBird(new Duck(name, id));
                    } else if (species.equalsIgnoreCase("Penguin")) {
                        b.addBird(new Penguin(name, id));
                    } else {
                        System.out.println("Invalid species");
                    }
                    break;

                case 2:
                    b.displayBirdInfo();
                    break;

                case 3:
                    b.displayFlyingBirds();
                    break;

                case 4:
                    b.displaySwimmingBirds();
                    break;

                case 5:
                    b.displayBothFlyingAndSwimmingBirds();
                    break;

                case 6:
                    System.out.print("Enter Bird ID to delete: ");
                    int deleteId = sc.nextInt();
                    b.removeBird(deleteId);
                    break;

                case 7:
                    b.report();
                    break;

                case 8:
                    System.out.println("Thank you for visiting EcoWing Sanctuary!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
}
