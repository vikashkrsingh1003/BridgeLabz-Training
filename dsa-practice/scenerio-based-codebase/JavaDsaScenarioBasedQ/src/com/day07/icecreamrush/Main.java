package com.day07.icecreamrush;

public class Main {
    public static void main(String[] args) {

        Flavor[] flavors = {
            new Flavor("Vanilla", 120),
            new Flavor("Chocolate", 200),
            new Flavor("Strawberry", 150),
            new Flavor("Mango", 90),
            new Flavor("Butterscotch", 170),
            new Flavor("Pistachio", 110),
            new Flavor("Mint", 130),
            new Flavor("Coffee", 160)
        };

        System.out.println("Before Sorting:");
        for (Flavor f : flavors) {
            f.display();
        }

        BubbleSort.sortBySales(flavors);

        System.out.println("\nAfter Sorting (Ascending Order):");
        for (Flavor f : flavors) {
            f.display();
        }
    }
}

