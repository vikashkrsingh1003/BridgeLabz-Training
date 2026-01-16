package com.day04.smartshelf;

import java.util.ArrayList;
import java.util.List;

// Book class
class Book {
    String title;

    public Book(String title) {
        this.title = title;
    }
}

// SmartShelf Sort class
class SmartShelfSort {
    private List<Book> books;

    public SmartShelfSort() {
        books = new ArrayList<>();
    }

    // Add a book and keep the list sorted using Insertion Sort
    public void addBook(String title) {
        Book newBook = new Book(title);
        books.add(newBook);

        //Insertion Sort logic 
        int i = books.size() - 1;
        while (i > 0 && books.get(i - 1).title.compareToIgnoreCase(newBook.title) > 0) {
            books.set(i, books.get(i - 1));
            i--;
        }
        books.set(i, newBook);
    }

    // Display the sorted book list
    public void displayBooks() {
        System.out.println("Sorted Reading List:");
        for (Book book : books) {
            System.out.println(book.title);
        }
        System.out.println();
    }
}

// Main class
public class SmartShelf {
    public static void main(String[] args) {
        SmartShelfSort shelf = new SmartShelfSort();

        // Adding books one by one (real-time sorting)
        shelf.addBook("Operating Systems");
        shelf.addBook("Algorithms");
        shelf.addBook("Data Structures");
        shelf.addBook("Database Systems");
        shelf.addBook("Computer Networks");

        //Display final sorted list
        shelf.displayBooks();
    }
}
