package com.day08.payxpress;

import java.time.LocalDate;

public class WaterBill extends Bill {

    public WaterBill(double amount, LocalDate dueDate) {
        super("Water", amount, dueDate);
    }

    public void pay() {
        markPaid();
        System.out.println("Water bill paid");
    }

    public void sendReminder() {
        System.out.println("Water bill reminder sent");
    }
}
