package com.constructors.level1;

public class Book {

    //Given Attributes
    private String title;
    private String author;
    private double price;

    //Default constructor
    public Book() {
        this.title = "Wings of Fire";
        this.author = "A.P.J. Abdul Kalam";
        this.price = 199.0;
    }

    //Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    //Method to display book details
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println();
    }

  
    public static void main(String[] args) {

        // Using default constructor
        Book book1 = new Book();
        book1.display();

        // Using parameterized constructor
        Book book2 = new Book("Malgudi Days", "Rk narayana", 45.99);
        book2.display();
    }
}


