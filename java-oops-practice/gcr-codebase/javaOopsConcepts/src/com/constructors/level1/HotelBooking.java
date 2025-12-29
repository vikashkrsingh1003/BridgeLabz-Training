package com.constructors.level1;

public class HotelBooking {
	private String guestName;
    private String roomType;
    private int nights;

    //Default constructor
    public HotelBooking() {
        this.guestName = "Guest";
        this.roomType = "Standard";
        this.nights = 1;
    }

    //Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    //Copy constructor
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    // Display method
    public void displayBooking() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
        System.out.println();
    }

  
    public static void main(String[] args) {
        // Default booking
        HotelBooking b1 = new HotelBooking();

        // Parameterized booking
        HotelBooking b2 = new HotelBooking("John", "Deluxe", 3);

        // Copy booking
        HotelBooking b3 = new HotelBooking(b2);

        System.out.println("Default Booking:");
        b1.displayBooking();

        System.out.println("\nParameterized Booking:");
        b2.displayBooking();

        System.out.println("\nCopied Booking:");
        b3.displayBooking();
    }
}
