package com.day08.payxpress;

import java.time.LocalDate;

public abstract class Bill implements IPayable {

    protected String type;
    protected double amount;
    protected LocalDate dueDate;
    private boolean isPaid;

    public Bill(String type, double amount, LocalDate dueDate) {
        this.type = type;
        this.amount = amount;
        this.dueDate = dueDate;
        this.isPaid = false;
    }

    public double calculateLateFee(double penalty) {
        return amount + penalty;
    }

    protected void markPaid() {
        this.isPaid = true;
    }

    public boolean isPaid() {
        return isPaid;
    }
}
