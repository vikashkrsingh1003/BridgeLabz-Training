package com.objectmodel.level1.Libraryandbooks;

import java.util.ArrayList;

public class Library {
    private String name;
    private ArrayList<Book> books;

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayLibraryBooks() {
        System.out.println("Library: " + name);
        for (Book book : books) {
            book.displayBook();
        }
        System.out.println();
    }
}

