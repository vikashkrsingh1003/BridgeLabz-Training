package com.day03.parceltracker;

public class Main {
         
	 public static void main(String args[]) {
	ParcelTracker track = new ParcelTracker();
	
	track.addStage("packed");
	track.addStage("shipped");
	track.addStage("In Transit");
	track.addStage("Delivred");
	

   track.addAfter("Shipped", "Customs Check");
    
	track.display();
	
        }
	 }
