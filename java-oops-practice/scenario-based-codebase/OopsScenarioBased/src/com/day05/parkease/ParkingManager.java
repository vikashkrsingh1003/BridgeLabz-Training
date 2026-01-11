package com.day05.parkease;

import java.util.ArrayList;
import java.util.List;

public class ParkingManager {

    private List<String> bookingLogs = new ArrayList<>();

    public void logBooking(String log) {
        bookingLogs.add(log);
    }

    public void showLogs() {
        System.out.println("\n--- Parking Logs ---");
        for (String log : bookingLogs) {
            System.out.println(log);
        }
    }
}
