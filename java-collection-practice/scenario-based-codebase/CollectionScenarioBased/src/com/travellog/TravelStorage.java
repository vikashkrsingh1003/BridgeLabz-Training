package com.travellog;

import java.io.*;
import java.util.*;

public class TravelStorage {

    public static void saveTrips(List<Trip> trips, String file) throws Exception {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
        out.writeObject(trips);
        out.close();
    }

    public static List<Trip> loadTrips(String file) throws Exception {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
        List<Trip> trips = (List<Trip>) in.readObject();
        in.close();
        return trips;
    }
}
