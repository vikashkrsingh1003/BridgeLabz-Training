package com.healthclinicApp.model;

public class Patient {

    private int patient_id;
    private String name;
    private String phone;
    private String dob;

    public Patient() {
    }

    public Patient(int patient_id, String name, String phone, String dob) {
        this.patient_id = patient_id;
        this.name = name;
        this.phone = phone;
        this.dob = dob;
    }

    public int getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}