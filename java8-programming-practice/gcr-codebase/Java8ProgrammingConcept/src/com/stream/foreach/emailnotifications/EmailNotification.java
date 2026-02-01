package com.stream.foreach.emailnotifications;

import java.util.List;

public class EmailNotification {

    public static void main(String[] args) {

        List<String> emails = List.of(
                "saurav@gmail.com",
                "viaksh@yahoo.com",
                "raghav@outlook.com",
                "kanshik@gmail.com"
        );

       emails.forEach(e -> System.out.println("Sending email to " + e));

    }
}
