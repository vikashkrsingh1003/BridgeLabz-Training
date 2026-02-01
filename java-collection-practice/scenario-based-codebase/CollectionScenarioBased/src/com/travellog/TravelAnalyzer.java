package com.travellog;

import java.util.*;
import java.util.regex.*;

public class TravelAnalyzer {

    public static List<String> findCitiesByRegex(List<Trip> trips, String regex) {
        List<String> result = new ArrayList<>();
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        for (Trip t : trips) {
            Matcher m = p.matcher(t.notes);
            if (m.find()) 
            	result.add(t.city);
        }
        return result;
    }

    public static List<Trip> longTrips(List<Trip> trips) {
        List<Trip> list = new ArrayList<>();
        for (Trip t : trips)
            if (t.days > 5) list.add(t);
        return list;
    }

    public static Set<String> uniqueCountries(List<Trip> trips) {
        Set<String> set = new HashSet<>();
        for (Trip t : trips) set.add(t.country);
        return set;
    }

    public static List<String> topCities(List<Trip> trips) {
        Map<String,Integer> map = new HashMap<>();

        for (Trip t : trips)
            map.put(t.city, map.getOrDefault(t.city, 0) + 1);

        List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());

        list.sort((a,b) -> b.getValue() - a.getValue());

        List<String> top = new ArrayList<>();
        for (int i = 0; i < Math.min(3, list.size()); i++)
            top.add(list.get(i).getKey());

        return top;
    }
}

