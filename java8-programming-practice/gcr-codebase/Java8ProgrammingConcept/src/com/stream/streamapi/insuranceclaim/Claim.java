package com.stream.streamapi.insuranceclaim;

class Claim {
    private String type;
    private double amount;

    Claim(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }
}


