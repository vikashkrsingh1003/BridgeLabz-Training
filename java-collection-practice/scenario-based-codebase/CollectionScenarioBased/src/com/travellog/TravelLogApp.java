package com.travellog;

import java.util.*;

public class TravelLogApp {

    public static void main(String[] args) throws Exception {

        List<Trip> trips = new ArrayList<>();

        trips.add(new Trip("Paris","France",7,"Loved cafes and museums"));
        trips.add(new Trip("Rome","Italy",4,"Ancient history everywhere"));
        trips.add(new Trip("Paris","France",6,"Food and art again"));
        trips.add(new Trip("Berlin","Germany",8,"Culture and nightlife"));
        trips.add(new Trip("Tokyo","Japan",5,"Technology and temples"));

        TravelStorage.saveTrips(trips,"trips.dat");

        List<Trip> loaded = TravelStorage.loadTrips("trips.dat");

        System.out.println(TravelAnalyzer.findCitiesByRegex(loaded,"art|history"));
        System.out.println(TravelAnalyzer.longTrips(loaded));
        System.out.println(TravelAnalyzer.uniqueCountries(loaded));
        System.out.println(TravelAnalyzer.topCities(loaded));
    }
}

