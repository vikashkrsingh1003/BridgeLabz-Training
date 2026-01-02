package com.day02.hospitalmanagementsystem;

public class Bill implements Payable {
    private double treatmentCost;
    private double taxRate;
    private double discount;

    public Bill(double treatmentCost, double taxRate, double discount) {
        this.treatmentCost = treatmentCost;
        this.taxRate = taxRate;
        this.discount = discount;
    }

    @Override
    public double calculatePayment() {
        double taxAmount = treatmentCost * taxRate;
        return (treatmentCost + taxAmount) - discount;
    }
}

