package com.practice.oops.calculateBill;

public class BrickTransport extends GoodsTransport{

	private float brickSize;
	private int brickQuantity;
	private float brickPrice;
	
	
	public float getBrickSize() {
		return brickSize;
	}
	public void setBrickSize(float brickSize) {
		this.brickSize = brickSize;
	}
	public int getBrickQuantity() {
		return brickQuantity;
	}
	public void setBrickQuantity(int brickQuantity) {
		this.brickQuantity = brickQuantity;
	}
	public float getBrickPrice() {
		return brickPrice;
	}
	public void setBrickPrice(float brickPrice) {
		this.brickPrice = brickPrice;
	}
	
	
	public BrickTransport(String transportId, String transportDate, int transportRating, float brickSize,
			int brickQuantity, float brickPrice) {
		super(transportId, transportDate, transportRating);
		this.brickSize = brickSize;
		this.brickQuantity = brickQuantity;
		this.brickPrice = brickPrice;
	}
	
	@Override
	public String vehicleSelection() {
		// TODO Auto-generated method stub
		
		if(brickQuantity<300) {
			return "Truck";
		}else if(brickQuantity >= 300 && brickQuantity <= 500) {
			return "Lorry";
		}else {
			return "MonsterLorry";
		}		
	}
	
    @Override
    public float calculateTotalCharge() {
    	
        // Calculate price
        float price = brickPrice * brickQuantity;
        
        //tax = 30 %
        float tax = price * 0.3f;
        
        // Get vehicle price
        String vehicle = vehicleSelection();
        float vehiclePrice = 0;
        switch (vehicle.toLowerCase()) {
            case "truck":
                vehiclePrice = 1000;
                break;
            case "lorry":
                vehiclePrice = 1700;
                break;
            case "monsterlorry":
                vehiclePrice = 3000;
                break;
        }
        
        // Calculate discount based on rating
        float discountPercentage = 0;
        if (transportRating == 5) {
            discountPercentage = 20;
        } else if (transportRating == 3 || transportRating == 4) {
            discountPercentage = 10;
        } else {
            discountPercentage = 0;
        }
        
        float discount = price * discountPercentage / 100;
        
        // Calculate total charge
        float totalCharge = (price + vehiclePrice + tax) - discount;
        
        return totalCharge;
    }
}

	   
	
	
	

