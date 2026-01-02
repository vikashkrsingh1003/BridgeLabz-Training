package com.day02.hospitalmanagementsystem;

public class Patient {
	
    protected int patientId;
    protected String name;
    private String medicalHistory;   // sensitive data

    public Patient(int patientId, String name) {
        this.patientId = patientId;
        this.name = name;
    }

    // Overloaded constructor (emergency admission)
    public Patient(int patientId, String name, String medicalHistory) {
        this(patientId, name);
        this.medicalHistory = medicalHistory;
    }

    public String getSummary() {
        return "Patient ID: " + patientId + ", Name: " + name;
    }

    public void displayInfo() {
        System.out.println(getSummary());
    }
}

