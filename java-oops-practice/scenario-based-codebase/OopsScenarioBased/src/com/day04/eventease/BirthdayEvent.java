package com.day04.eventease;

public class BirthdayEvent extends Event {

    public BirthdayEvent(String name, String location, String date, int attendees, User user,
                          double venue, double services, double discount) {
        super(name, location, date, attendees, user, venue, services, discount);
    }

    @Override
    public void schedule() {
        System.out.println(" Birthday party scheduled with cake & decorations!");
    }

    @Override
    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println("Birthday event rescheduled to " + newDate);
    }

    @Override
    public void cancel() {
        System.out.println("Birthday event cancelled.");
    }
}
