package com.day02.hospitalmanagementsystem;

public class HospitalApp {
    public static void main(String[] args) {

        Patient p1 = new InPatient(101, "Mayank", 5);
        Patient p2 = new OutPatient(102, "manish", "10-Oct-2025");

        Doctor d1 = new Doctor(1, "Dr. Yashraj chauhan ", "Cardiology");

        Bill bill = new Bill(20000, 0.05, 1500);

        // Polymorphism
        p1.displayInfo();
        p2.displayInfo();
        d1.displayInfo();

        System.out.println("----------------------------------");
        System.out.println("Total Bill Amount: Rs" + bill.calculatePayment());
    }
}

