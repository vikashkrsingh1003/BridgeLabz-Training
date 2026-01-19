package com.day08.payxpress;

import java.time.LocalDate;

public class ElectricityBill extends Bill {

    public ElectricityBill(double amount, LocalDate dueDate) {
        super("Electricity", amount, dueDate);
    }

    public void pay() {
        markPaid();
        System.out.println("Electricity bill paid");
    }

    public void sendReminder() {
        System.out.println("Electricity bill reminder sent");
    }
}
