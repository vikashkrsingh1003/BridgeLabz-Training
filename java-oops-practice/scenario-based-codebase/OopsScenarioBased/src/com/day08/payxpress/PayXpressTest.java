package com.day08.payxpress;

import java.time.LocalDate;

public class PayXpressTest {

    public static void main(String[] args) {

        Bill b1 = new ElectricityBill(1200, LocalDate.now().plusDays(5));
        Bill b2 = new WaterBill(600, LocalDate.now().plusDays(3));
        Bill b3 = new InternetBill(999, LocalDate.now().plusDays(2));

        b1.sendReminder();
        b2.sendReminder();
        b3.sendReminder();

        b1.pay();
        b2.pay();

        System.out.println(b3.calculateLateFee(100));
    }
}
