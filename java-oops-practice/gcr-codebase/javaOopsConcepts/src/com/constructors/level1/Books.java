package com.constructors.level1;

public class Books{

    public String ISBN;
    protected String title;
    private String author;

    // Constructor
    public Books(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Setter method for private variable
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter method for private variable
    public String getAuthor() {
        return author;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

  // Subclass EBook
class EBook extends Books {

    private double fileSize;

    // Constructor for EBook
    public EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author); // calling parent constructor
        this.fileSize = fileSize;
    }

    // Method to demonstrate access modifiers
    public void displayEBookDetails() {

        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + getAuthor());

        System.out.println("File Size: " + fileSize + " MB");
    }

   
    public static void main(String[] args) {

        EBook ebook = new EBook(
                "978-0134685991",
                "Wings of Fire",
                "A. P. J. Abdul Kalam",
                5.2
        );

        // Modify author using setter
        ebook.setAuthor("Dr. A. P. J. Abdul Kalam");

        // Display ebook details
        ebook.displayEBookDetails();
    }
}
