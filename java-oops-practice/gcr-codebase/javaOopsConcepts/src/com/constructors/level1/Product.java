package com.constructors.level1;

public class Product {
	
	    // Instance variables (unique to each product)
	    private String productName;
	    private double price;

	    // Class variable (shared among all Product objects)
	    private static int totalProducts = 0;

	    // Constructor to initialize product details
	    public Product(String productName, double price) {
	        this.productName = productName;
	        this.price = price;

	        //Increase totalProducts count whenever a new product is created
	        totalProducts++;
	    }

	    //Display the details
	    public void displayProductDetails() {
	        System.out.println("Product Name: " + productName);
	        System.out.println("Price: " + price);
	    }

	    //Display total number of products created
	    public static void displayTotalProducts() {
	        System.out.println("Total Products Created: " + totalProducts);
	    }

	    public static void main(String[] args) {

	        // Creating product objects
	        Product p1 = new Product("Laptop", 800.50);
	        Product p2 = new Product("Mouse", 25.99);

	        //Display details of each product
	        p1.displayProductDetails();
	        System.out.println();
	        p2.displayProductDetails();
	        System.out.println();

	        // Display total number of products
	        Product.displayTotalProducts();
	    }
   }


