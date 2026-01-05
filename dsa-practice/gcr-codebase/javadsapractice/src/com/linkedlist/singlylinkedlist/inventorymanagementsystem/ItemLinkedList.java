package com.linkedlist.singlylinkedlist.inventorymanagementsystem;

import com.linkedlist.singlylinkedlist.studentrecordmanagement.StudentNode;

public class ItemLinkedList {

	  ItemNode head;
	
	//Add element at beginning
	 void addAtBeginning(String itemName, int itemId, int quantity,double price) {
		 
		 ItemNode newItem = new ItemNode(itemName , itemId , quantity,price);
		 newItem.next = head;
		 head = newItem;
	 }
	 
	//Add element at the last
       void addAtEnd(String itemName, int itemId, int quantity,double price) {
		 
		 ItemNode newItem = new ItemNode(itemName , itemId , quantity,price);
		 
		 if(head == null) {
			 newItem = head;
			 return;
		 }
		 ItemNode temp = head;
		 while (temp.next != null) {
	            temp = temp.next;
	        }
	        temp.next = newItem;
     }
       
     //Add elememnt at specefic position
       void addAtPosition(int position , String itemName, int itemId, int quantity,double price) {
  		 
    	   if(position == 1) {
    		   addAtBeginning(itemName , itemId , quantity,price);
    		   return;
    	   }
    	   
  		 ItemNode newItem = new ItemNode(itemName , itemId , quantity,price);
  		 ItemNode temp = head;
  		
  		 for (int i = 1; i < position - 1 && temp != null; i++) {
             temp = temp.next;
         }

         if (temp == null) {
             System.out.println("Invalid position");
             return;
         }

         newItem.next = temp.next;
         temp.next = newItem;
  		  
       }
       
     //delete items by using item Id:
       void deleteByitemId(int itemId) {
    	   
           if (head == null) {
               System.out.println("List is empty");
               return;
           }

           if (head.itemId == itemId) {
               head = head.next;
               return;
           }

            ItemNode temp = head;
           while (temp.next != null && temp.next.itemId != itemId) {
               temp = temp.next;
           }

           if (temp.next == null) {
               System.out.println("Items not found");
           } else {
               temp.next = temp.next.next;
           }
       }
     //update quantity by using item Id
       void updateQuantity(int itemId, int newQuantity) {
           ItemNode temp = head;

           while (temp != null) {
               if (temp.itemId == itemId) {
                   temp.quantity = newQuantity;
                   System.out.println("Quantity updated successfully");
                   return;
               }
               temp = temp.next;
           }
           System.out.println("items not found");
       }
       
       /*  Search by Item ID */
       public void searchById(int id) {
           ItemNode temp = head;

           while (temp != null) {
               if (temp.itemId == id) {
                   displayItem(temp);
                   return;
               }
               temp = temp.next;
           }
           System.out.println("Item not found!");
       }

       /*  Search by Item Name */
       public void searchByName(String name) {
           ItemNode temp = head;
           boolean found = false;

           while (temp != null) {
               if (temp.itemName.equalsIgnoreCase(name)) {
                   displayItem(temp);
                   found = true;
               }
               temp = temp.next;
           }

           if (!found)
               System.out.println("Item not found!");
       }
       /*  Calculate Total Inventory Value */
       public void calculateTotalValue() {
           double total = 0;
           ItemNode temp = head;

           while (temp != null) {
               total += temp.price * temp.quantity;
               temp = temp.next;
           }

           System.out.println("Total Inventory Value: ₹" + total);
       }

       /* Sort by Name (Ascending / Descending) */
       public void sortByName(boolean ascending) {
           for (ItemNode i = head; i != null; i = i.next) {
               for (ItemNode j = i.next; j != null; j = j.next) {
                   if ((ascending && i.itemName.compareToIgnoreCase(j.itemName) > 0) ||
                       (!ascending && i.itemName.compareToIgnoreCase(j.itemName) < 0)) {
                       swap(i, j);
                   }
               }
           }
           System.out.println("Inventory sorted by name.");
       }

       /*Sort by Price (Ascending / Descending) */
       public void sortByPrice(boolean ascending) {
           for (ItemNode i = head; i != null; i = i.next) {
               for (ItemNode j = i.next; j != null; j = j.next) {
                   if ((ascending && i.price > j.price) ||
                       (!ascending && i.price < j.price)) {
                       swap(i, j);
                   }
               }
           }
           System.out.println("Inventory sorted by price.");
       }
	//methode to display items details
	    void displayItems() {
	        ItemNode temp = head;

	        while (temp != null) {
	            System.out.println( "Item Name: " + temp.itemName +", Item Id : " + temp.itemId +", Quantity: " + temp.quantity +", Price: " + temp.price);
	            temp = temp.next;
	        }
	    }
	    /* Helper Methods */
	    private void swap(ItemNode a, ItemNode b) {
	        int id = a.itemId;
	        String name = a.itemName;
	        int qty = a.quantity;
	        double price = a.price;

	        a.itemId = b.itemId;
	        a.itemName = b.itemName;
	        a.quantity = b.quantity;
	        a.price = b.price;

	        b.itemId = id;
	        b.itemName = name;
	        b.quantity = qty;
	        b.price = price;
	    }

	    private void displayItem(ItemNode i) {
	        System.out.println("Item ID: " + i.itemId);
	        System.out.println("Name: " + i.itemName);
	        System.out.println("Quantity: " + i.quantity);
	        System.out.println("Price: ₹" + i.price);
	    }
}
