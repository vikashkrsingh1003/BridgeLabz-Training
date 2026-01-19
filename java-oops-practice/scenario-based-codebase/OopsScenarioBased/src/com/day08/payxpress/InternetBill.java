package com.day08.payxpress;

import java.time.LocalDate;

public class InternetBill extends Bill {

    public InternetBill(double amount, LocalDate dueDate) {
        super("Internet", amount, dueDate);
    }

    public void pay() {
        markPaid();
        System.out.println("Internet bill paid");
    }

    public void sendReminder() {
        System.out.println("Internet bill reminder sent");
    }
}
