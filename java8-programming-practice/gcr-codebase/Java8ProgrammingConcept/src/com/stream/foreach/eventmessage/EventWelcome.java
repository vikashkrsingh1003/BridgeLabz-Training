package com.stream.foreach.eventmessage;

import java.util.List;

public class EventWelcome {

    public static void main(String[] args) {

        List<String> attendees = List.of(
                "Saurav",
                "Rahul",
                "Neha",
                "Anita",
                "Vikas"
        );

       attendees.forEach(a -> System.out.println("Welcome " + a));

    }
}
