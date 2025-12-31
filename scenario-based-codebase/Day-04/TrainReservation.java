// Train Reservation Queue 
// Simulate a basic ticket booking system.
// ● Show menu with switch
// ● Allow multiple bookings using while-loop.
// ● Stop booking once seats reach zero (break).

import java.util.*;
public class TrainReservation {


    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int totalSeats = 5;      // total available seats
        int bookedSeats = 0;     // seats already booked
        String choice;

        while (totalSeats > 0) {

            System.out.println("\nEnter your choice: (Book / Cancel / Exit)");
            choice = sc.next();

            if (!choice.equals("Book") && !choice.equals("Cancel")) {
                break; 
            }

            switch (choice) {

                case "Book":
                    if (totalSeats > 0) {
                        System.out.println("----------------------------------------------");
                        System.out.println("Ticket booked successfully!!! ");
                        totalSeats--;
                        bookedSeats++;
                    } else {
                        System.out.println("No seats available ");
                        break;
                    }
                    break;

                case "Cancel":
                    if (bookedSeats > 0) {
                         System.out.println("----------------------------------------------");
                        System.out.println("Ticket cancelled successfully!!!!");
                        totalSeats++;
                        bookedSeats--;
                    } else {
                        System.out.println("No bookings to cancel ");
                    }
                    break;
            }

            System.out.println("Available seats: " + totalSeats);
            System.out.println("Booked seats: " + bookedSeats);
            System.out.println("----------------------------------------------");

            if (totalSeats == 0) {
                System.out.println("-----------------------------------");
                System.out.println("|| Train is Full. Booking closed! ||");
                System.out.println("-----------------------------------");
                break;
            }
        }

        sc.close();
    }
}
