package com.day01.ambulanceroute;

public class Main {
    public static void main(String[] args) {

        AmbulanceRoute route = new AmbulanceRoute();

        route.addUnit("Emergency", false);
        route.addUnit("Radiology", true);
        route.addUnit("Surgery", false);
        route.addUnit("ICU", true);

        route.findAvailableUnit();   // Should redirect to Radiology

        route.removeUnit("Radiology");

        route.findAvailableUnit();   // Should redirect to ICU
    }
}

