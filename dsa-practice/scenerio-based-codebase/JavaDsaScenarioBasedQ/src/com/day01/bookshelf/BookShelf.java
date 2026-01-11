package com.day01.bookshelf;

import java.util.*;

public class BookShelf {

    // genre → list of books
    private Map<String, LinkedList<Book>> catalog = new HashMap<>();

    // prevents duplication
    private Set<Book> bookSet = new HashSet<>();

    // Add a book
    public void addBook(Book book) {
        if (bookSet.contains(book)) {
            System.out.println("Duplicate book ignored: " + book);
            return;
        }

        catalog.putIfAbsent(book.getGenre(), new LinkedList<>());
        catalog.get(book.getGenre()).add(book);
        bookSet.add(book);

        System.out.println("Added: " + book);
    }

    // Remove (borrow) a book
    public void removeBook(Book book) {
        LinkedList<Book> books = catalog.get(book.getGenre());

        if (books != null && books.remove(book)) {
            bookSet.remove(book);
            System.out.println("Removed: " + book);
        } else {
            System.out.println("Book not found: " + book);
        }
    }

    // Display genre-wise catalog
    public void displayCatalog() {
        for (String genre : catalog.keySet()) {
            System.out.println("Genre: " + genre);
            for (Book book : catalog.get(genre)) {
                System.out.println("  - " + book);
            }
        }
    }
}
