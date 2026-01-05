package com.linkedlist.singlylinkedlist.inventorymanagementsystem;

public class ItemNode {

	String itemName;
	int itemId;
	int quantity;
	double price;
	
	ItemNode next;
	
	public ItemNode(String itemName , int itemId , int quantity , double price) {
		
		this.itemId = itemId;
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
		this.next = null;
	}
}
