package com.day04.eventease;

import java.util.Scanner;

public class EventEaseApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Welcome to EventEase ");

        System.out.print("Organizer Name: ");
        String userName = sc.nextLine();

        System.out.print("Organizer Email: ");
        String email = sc.nextLine();

        User user = new User(userName, email);

        System.out.print("Event Name: ");
        String eventName = sc.nextLine();

        System.out.print("Location: ");
        String location = sc.nextLine();

        System.out.print("Date (dd-mm-yyyy): ");
        String date = sc.nextLine();

        System.out.print("Number of Attendees: ");
        int attendees = sc.nextInt();

        System.out.print("Venue Cost: ");
        double venue = sc.nextDouble();

        System.out.print("Service Cost (catering/decoration): ");
        double services = sc.nextDouble();

        System.out.print("Discount: ");
        double discount = sc.nextDouble();

        sc.nextLine(); // consume newline

        System.out.print("Event Type (Birthday / Conference): ");
        String type = sc.nextLine().toLowerCase();

        Event event;

        if (type.equals("birthday")) {
            event = new BirthdayEvent(eventName, location, date, attendees, user, venue, services, discount);
        } else if (type.equals("conference")) {
            event = new ConferenceEvent(eventName, location, date, attendees, user, venue, services, discount);
        } else {
            System.out.println("Invalid event type. Exiting...");
            sc.close();
            return;
        }

        event.schedule();
        event.showDetails();

        sc.close();
    }
}
