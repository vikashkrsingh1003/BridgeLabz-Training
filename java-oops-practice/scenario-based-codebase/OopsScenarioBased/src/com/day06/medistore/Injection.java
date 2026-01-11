package com.day06.medistore;

import java.time.LocalDate;

public class Injection extends Medicine {

    public Injection(String name, double price, LocalDate expiryDate) {
        super(name, price, expiryDate);
    }

    @Override
    public boolean checkExpiry() {
        // Very sensitive – expires 10 days earlier
        return expiryDate.minusDays(10).isAfter(LocalDate.now());
    }
}
