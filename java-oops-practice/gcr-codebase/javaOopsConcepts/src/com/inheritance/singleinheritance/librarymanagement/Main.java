package com.inheritance.singleinheritance.librarymanagement;

public class Main {
    public static void main(String[] args) {

        Author bookAuthor = new Author(
                "Java Programming",
                2022,
                "James Gosling",
                "Creator of the Java programming language"
        );

        bookAuthor.displayInfo();
    }
}

