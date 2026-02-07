package com.practice.oops.calculateBill;

class TimberTransport extends GoodsTransport {
    private float timberLength;
    private float timberRadius;
    private String timberType;
    private float timberPrice;
    
    // Constructor
    public TimberTransport(String transportId, String transportDate, int transportRating,
                          float timberLength, float timberRadius, 
                          String timberType, float timberPrice) {
        super(transportId, transportDate, transportRating);
        this.timberLength = timberLength;
        this.timberRadius = timberRadius;
        this.timberType = timberType;
        this.timberPrice = timberPrice;
    }
    
    // Getters and setters
    public float getTimberLength() {
        return timberLength;
    }
    
    public void setTimberLength(float timberLength) {
        this.timberLength = timberLength;
    }
    
    public float getTimberRadius() {
        return timberRadius;
    }
    
    public void setTimberRadius(float timberRadius) {
        this.timberRadius = timberRadius;
    }
    
    public String getTimberType() {
        return timberType;
    }
    
    public void setTimberType(String timberType) {
        this.timberType = timberType;
    }
    
    public float getTimberPrice() {
        return timberPrice;
    }
    
    public void setTimberPrice(float timberPrice) {
        this.timberPrice = timberPrice;
    }
    
     // Vehicle selection based on timber area
    @Override
    public String vehicleSelection() {
    	
        // Calculate area: 2 * 3.147 * radius * length
        float area = 2 * 3.147f * timberRadius * timberLength;
        
        if (area < 250) {
            return "Truck";
        } else if (area >= 250 && area <= 400) {
            return "Lorry";
        } else {
            return "MonsterLorry";
        }
    }
    
    // Calculate total charge
    @Override
    public float calculateTotalCharge() {
    	
        // Calculate volume: 3.147 * radius^2 * length
        float volume = 3.147f * timberRadius * timberRadius * timberLength;
        
        //Calculate price based on timber type
        float typeMultiplier = 0;
        if (timberType.equalsIgnoreCase("premium")) {
            typeMultiplier = 0.25f;
        } else if (timberType.equalsIgnoreCase("nonpremium")) {
            typeMultiplier = 0.15f;
        }
        
        float price = volume * timberPrice * typeMultiplier;
        
        //Calculate tax 
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


    