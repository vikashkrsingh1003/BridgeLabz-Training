package com.lambdaexpressions.notificationfilter;

import java.util.*;
import java.util.function.Predicate;

public class HospitalApp {

    public static void main(String[] args) {

        List<Alert> alerts = new ArrayList<>();

        alerts.add(new Alert("Heart rate critical ", "EMERGENCY"));
        alerts.add(new Alert("Doctor appointment at 8 AM", "APPOINTMENT"));
        alerts.add(new Alert("Take blood pressure medicine", "MEDICINE"));
        alerts.add(new Alert("General hospital notice", "GENERAL"));

        //User preference:- Emergancy or Medicine alerts
        Predicate<Alert> userPreference =
                alert -> alert.getType().equalsIgnoreCase("EMERGENCY") || alert.getType().equalsIgnoreCase("MEDICINE");

        System.out.println("---- Filtered Alerts ----");

        for (Alert alert : alerts) {
            if (userPreference.test(alert)) {
                System.out.println(alert);
            }
        }
    }
}
