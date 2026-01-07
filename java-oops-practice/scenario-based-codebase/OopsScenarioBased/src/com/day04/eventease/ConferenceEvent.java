package com.day04.eventease;

public class ConferenceEvent extends Event {

    public ConferenceEvent(String name, String location, String date, int attendees, User user,
                            double venue, double services, double discount) {
        super(name, location, date, attendees, user, venue, services, discount);
    }

    @Override
    public void schedule() {
        System.out.println("Conference scheduled with speakers & AV setup!");
    }

    @Override
    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println("Conference rescheduled to " + newDate);
    }

    @Override
    public void cancel() {
        System.out.println("Conference event cancelled.");
    }
}

