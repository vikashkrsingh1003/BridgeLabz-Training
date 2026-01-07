package com.day04.eventease;

import java.util.UUID;

public abstract class Event implements ISchedulable {

    protected String eventName;
    protected String location;
    protected String date;
    protected int attendees;

    private final String eventId; // cannot be modified
    private double venueCost;
    private double serviceCost;
    private double discount;

    protected User organizer;

    // Constructor without services
    public Event(String eventName, String location, String date, int attendees, User organizer) {
        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.attendees = attendees;
        this.organizer = organizer;
        this.eventId = UUID.randomUUID().toString();
    }

    // Constructor with services
    public Event(String eventName, String location, String date, int attendees,
                 User organizer, double venueCost, double serviceCost, double discount) {
        this(eventName, location, date, attendees, organizer);
        this.venueCost = venueCost;
        this.serviceCost = serviceCost;
        this.discount = discount;
    }

    // Cost calculation using operators
    public double calculateTotalCost() {
        return venueCost + serviceCost - discount;
    }

    public String getEventId() {
        return eventId;
    }

    public void showDetails() {
        System.out.println("\nEvent ID: " + eventId);
        System.out.println("Event: " + eventName);
        System.out.println("Location: " + location);
        System.out.println("Date: " + date);
        System.out.println("Attendees: " + attendees);
        System.out.println("Organizer: " + organizer.getName());
        System.out.println("Total Cost: ₹" + calculateTotalCost());
    }
}
