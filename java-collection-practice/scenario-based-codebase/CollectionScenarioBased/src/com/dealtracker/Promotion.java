package com.dealtracker;

import java.time.LocalDate;

public class Promotion <T>{

	String code;
    T benefit;
    LocalDate validTill;

    public Promotion(String code, T benefit, LocalDate validTill) {
        this.code = code;
        this.benefit = benefit;
        this.validTill = validTill;
    }	
}
