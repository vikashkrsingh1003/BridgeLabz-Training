package com.constructors.level1;

public class LibraryBook {
	
	    String title;
	    String author;
	    double price;
	    boolean availability;

	    // Constructor
	    LibraryBook(String title, String author, double price) {
	        this.title = title;
	        this.author = author;
	        this.price = price;
	        this.availability = true; 
	    }
	    
	    void borrowBook() {
	        if (availability) {
	            availability = false;
	            System.out.println("You have successfully borrowed: " + title);
	        } else {
	            System.out.println("Sorry, the book is currently not available.");
	        }
	    }
	    // Method to display book details
	    public void displayDetails() {
	        System.out.println("Title: " + title);
	        System.out.println("Author: " + author);
	        System.out.println("Price: $" + price);
	        System.out.println("Available: " + availability);
	    }
	    
	    public static void main(String args[]) {
	    	 LibraryBook book1 = new LibraryBook("Java Programming", "James Gosling", 45.99);
	         book1.displayDetails();
	         book1.borrowBook();
	         book1.borrowBook();

	         System.out.println();
	  }

}
