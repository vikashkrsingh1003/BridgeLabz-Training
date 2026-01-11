package com.day06.tourmate;

import java.util.*;

public class TourMateTest {

	public static void main(String[] args) {
	
		 Transport flight = new Transport("Flight", 15000);
	        Hotel hotel = new Hotel("Sea View", 3000, 5);

	        List<Activity> activities = new ArrayList<>();
	        activities.add(new Activity("City Tour", 2000));
	        activities.add(new Activity("Adventure Sports", 5000));

	        Trip trip1 = new DomesticTrip(
	                "Goa", 5, flight, hotel, activities);

	        Trip trip2 = new InternationalTrip(
	                "Bali", 6, flight, hotel, activities);

	        trip1.book();
	        trip2.book();

	}

}