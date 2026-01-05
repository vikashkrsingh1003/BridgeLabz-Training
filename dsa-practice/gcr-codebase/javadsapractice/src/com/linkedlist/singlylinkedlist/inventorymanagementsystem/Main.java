package com.linkedlist.singlylinkedlist.inventorymanagementsystem;

public class Main {
    
	public static void main(String args[]) {
	   ItemLinkedList list = new ItemLinkedList();
	   
	   list.addAtBeginning("Bike",101, 2,100000);
	  	   
	   list.addAtEnd("Car",102,2,5050000);
	   
	   list.addAtPosition(2,"Truck", 103, 2, 10000000);
	   list.displayItems();
	   
	   
	   list.deleteByitemId(102);
	   System.out.println("\n------After deletion of item-----");
	   list.displayItems();
	   
	   System.out.println("\n------items Quantity change -----");
	   list.updateQuantity(103, 5);   

       System.out.println("\nSearch by ID 102:");
       list.searchById(102);

       System.out.println("\nUpdate Quantity of ID 101:");
       list.updateQuantity(101, 15);

       System.out.println("\nTotal Inventory Value:");
       list.calculateTotalValue();

       System.out.println("\nSort by Name (Ascending):");
       list.sortByName(true);
       list.displayItems();

       System.out.println("\nSort by Price (Descending):");
      list.sortByPrice(false);
      list.displayItems();

	}
}
