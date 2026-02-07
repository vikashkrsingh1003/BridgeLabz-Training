package com.practice.oops.calculateBill;

public class Utility {

	    // Parse details and return appropriate object
	    public GoodsTransport parseDetails(String input) {
	        String[] parts = input.split(":");
	        
	        String transportId = parts[0];
	        String transportDate = parts[1];
	        int transportRating = Integer.parseInt(parts[2]);
	        String transportType = parts[3];
	        
	        if (transportType.equalsIgnoreCase("BrickTransport")) {
	            float brickSize = Float.parseFloat(parts[4]);
	            int brickQuantity = Integer.parseInt(parts[5]);
	            float brickPrice = Float.parseFloat(parts[6]);
	            
	            return new BrickTransport(transportId, transportDate, transportRating,
	                                     brickSize, brickQuantity, brickPrice);
	        }
	        else if (transportType.equalsIgnoreCase("TimberTransport")) {
	            float timberLength = Float.parseFloat(parts[4]);
	            float timberRadius = Float.parseFloat(parts[5]);
	            String timberType = parts[6];
	            float timberPrice = Float.parseFloat(parts[7]);
	            
	            return new TimberTransport(transportId, transportDate, transportRating,
	                                      timberLength, timberRadius, timberType, timberPrice);
	        }
	        
	        return null;
	    }
	    
	    // Validate transport ID
	    public boolean validateTransportId(String transportId) {
	        if (transportId.length() >= 3 && transportId.substring(0, 3).equals("RTS")) {
	            return true;
	        }
	        return false;
	    }
	}

