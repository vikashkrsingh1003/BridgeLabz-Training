package com.healthclinicApp.model;

public class Doctor {

    private int doctor_id;
    private String name;
    private String specialty;

    public Doctor() {
    }

    public Doctor(int doctor_id, String name, String specialty) {
        this.doctor_id = doctor_id;
        this.name = name;
        this.specialty = specialty;
    }

    public int getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(int doctor_id) {
        this.doctor_id = doctor_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}