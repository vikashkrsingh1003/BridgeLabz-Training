package com.day02.hospitalmanagementsystem;

public class HospitalApp {
    public static void main(String[] args) {

        Patient p1 = new InPatient(101, "Alice", 5);
        Patient p2 = new OutPatient(102, "Bob", "10-Oct-2025");

        Doctor d1 = new Doctor(1, "Dr. Smith", "Cardiology");

        Bill bill = new Bill(20000, 0.05, 1500);

        // Polymorphism
        p1.displayInfo();
        p2.displayInfo();
        d1.displayInfo();

        System.out.println("Total Bill Amount: ₹" + bill.calculatePayment());
    }
}

