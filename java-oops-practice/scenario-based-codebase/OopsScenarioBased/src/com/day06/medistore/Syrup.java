package com.day06.medistore;

import java.time.LocalDate;

public class Syrup extends Medicine {

    public Syrup(String name, double price, LocalDate expiryDate) {
        super(name, price, expiryDate);
    }

    @Override
    public boolean checkExpiry() {
        // Liquid medicines expire 5 days earlier
        return expiryDate.minusDays(5).isAfter(LocalDate.now());
    }
}
