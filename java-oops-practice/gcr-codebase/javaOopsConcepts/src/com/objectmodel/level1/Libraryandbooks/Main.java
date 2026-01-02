package com.objectmodel.level1.Libraryandbooks;

public class Main {
    public static void main(String[] args) {

        // Books exist independently
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");

        // Libraries
        Library cityLibrary = new Library("City Library");
        Library schoolLibrary = new Library("School Library");

        // Aggregation: adding books to libraries
        cityLibrary.addBook(book1);
        cityLibrary.addBook(book2);

        schoolLibrary.addBook(book1); // Same book in another library

        // Display contents
        cityLibrary.displayLibraryBooks();
        schoolLibrary.displayLibraryBooks();
    }
}
