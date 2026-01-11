package com.day01.bookshelf;

public class LibraryApp {
    public static void main(String[] args) {

        BookShelf shelf = new BookShelf();

        Book b1 = new Book("1984", "George Orwell", "Fiction");
        Book b2 = new Book("Dune", "Frank Herbert", "Sci-Fi");
        Book b3 = new Book("Foundation", "Isaac Asimov", "Sci-Fi");

        shelf.addBook(b1);
        shelf.addBook(b2);
        shelf.addBook(b3);

        // Duplicate check
        shelf.addBook(b2);

        System.out.println("\nLibrary Catalog:");
        shelf.displayCatalog();

        // Borrow a book
        shelf.removeBook(b2);

        System.out.println("\nAfter Borrowing:");
        shelf.displayCatalog();
    }
}

