package com.day06.medistore;
import java.time.LocalDate;

public class Tablet extends Medicine {

    public Tablet(String name, double price, LocalDate expiryDate) {
        super(name, price, expiryDate);
    }

    @Override
    public boolean checkExpiry() {
        return expiryDate.isAfter(LocalDate.now());
    }
}

