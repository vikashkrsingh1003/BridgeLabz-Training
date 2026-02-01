package com.dealtracker;
 
import java.time.*;

import java.time.LocalDate;

public class Deal {
    private String code;
    private LocalDate validTill;
    private int discount;
    private int minPurchase;

    public Deal(String code, LocalDate validTill,
                int discount, int minPurchase) {
        this.code = code;
        this.validTill = validTill;
        this.discount = discount;
        this.minPurchase = minPurchase;
    }

    public String getCode() { return code; }
    public LocalDate getValidTill() { return validTill; }
    public int getDiscount() { return discount; }

    @Override
    public String toString() {
        return code + " (" + discount + "% till " + validTill + ")";
    }
}
