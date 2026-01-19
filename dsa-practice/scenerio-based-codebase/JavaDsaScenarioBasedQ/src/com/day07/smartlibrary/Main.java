package com.day07.smartlibrary;

public class Main {
    public static void main(String[] args) {

        Book[] borrowedBooks = {
            new Book("Data Structures"),
            new Book("Algorithms"),
            new Book("Computer Networks"),
            new Book("Operating Systems"),
            new Book("Database Systems")
        };

        System.out.println("Before Sorting:");
        for (Book b : borrowedBooks) {
            b.display();
        }

        InsertionSort.sortBooks(borrowedBooks);

        System.out.println("\nAfter Sorting (Alphabetical Order):");
        for (Book b : borrowedBooks) {
            b.display();
        }
    }
}

