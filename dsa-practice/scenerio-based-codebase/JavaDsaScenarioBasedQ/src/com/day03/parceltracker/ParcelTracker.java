package com.day03.parceltracker;

import com.day02.TrainCompanion.Compartment;

public class ParcelTracker {
  
	private StageNode head;
	
	public void addStage(String name) {
	    StageNode newNode = new StageNode(name);

	    if (head == null) {
	        head = newNode;
	        return;
	    }

	    StageNode temp = head;
	    while (temp.next != null) {
	        temp = temp.next;
	    }
	    temp.next = newNode;
	}

	 public void addAfter(String existingStage, String newStage) {
	        StageNode temp = head;

	        while (temp != null && !temp.stage.equals(existingStage)) {
	            temp = temp.next;
	        }

	        if (temp == null) {
	            System.out.println("Stage not found. Parcel may be lost.");
	            return;
	        }

	        StageNode newNode = new StageNode(newStage);
	        newNode.next = temp.next;
	        temp.next = newNode;
	    }
	
	 public void display() {
	        if (head == null) {
	            System.out.println("No tracking data available.");
	            return;
	        }

	        StageNode temp = head;
	        while (temp != null) {
	            System.out.print(temp.stage + " → ");
	            temp = temp.next;
	        }

	    }

}
