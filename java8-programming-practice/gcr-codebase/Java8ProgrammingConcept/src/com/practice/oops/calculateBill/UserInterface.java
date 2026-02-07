package com.practice.oops.calculateBill;

import java.util.*;

public class UserInterface {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        Utility utility = new Utility();
        
        System.out.println("Enter the Goods Transport details");
        String input = sc.nextLine();
        
        //Split input to get transport ID for validation
        String[] parts = input.split(":");
        String transportId = parts[0];
        
        // Validate transport ID
        if (!utility.validateTransportId(transportId)) {
            System.out.println("Transport id " + transportId + " is invalid");
            System.out.println("Please provide a valid record");
            sc.close();
            return;
        }
        
        // Parse details and get object
        GoodsTransport goodsTransport = utility.parseDetails(input);
        
        if (goodsTransport == null) {
            System.out.println("Invalid transport type");
            sc.close();
            return;
        }
        
        // Display details
        System.out.println("\nTransporter id : " + goodsTransport.getTransportId());
        System.out.println("Date of transport : " + goodsTransport.getTransportDate());
        System.out.println("Rating of the transport : " + goodsTransport.getTransportRating());
        
        // Check object type and display specific details
        if (goodsTransport instanceof BrickTransport) {
            BrickTransport brickTransport = (BrickTransport) goodsTransport;
            System.out.println("Quantity of bricks : " + brickTransport.getBrickQuantity());
            System.out.println("Brick price : " + brickTransport.getBrickPrice());
            System.out.println("Vehicle for transport : " + brickTransport.vehicleSelection());
            System.out.println("Total charge : " + brickTransport.calculateTotalCharge());
        } 
        else if (goodsTransport instanceof TimberTransport) {
            TimberTransport timberTransport = (TimberTransport) goodsTransport;
            System.out.println("Type of the timber : " + timberTransport.getTimberType());
            System.out.println("Timber price per kilo : " + timberTransport.getTimberPrice());
            System.out.println("Vehicle for transport : " + timberTransport.vehicleSelection());
            System.out.println("Total charge : " + timberTransport.calculateTotalCharge());
        }
        
        sc.close();
    }
}