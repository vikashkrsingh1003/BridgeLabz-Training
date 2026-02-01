package com.travellog;

import java.io.Serializable;

public class Trip implements Serializable {
    String city;
    String country;
    int days;
    String notes;

    public Trip(String city, String country, int days, String notes) {
        this.city = city;
        this.country = country;
        this.days = days;
        this.notes = notes;
    }
}

