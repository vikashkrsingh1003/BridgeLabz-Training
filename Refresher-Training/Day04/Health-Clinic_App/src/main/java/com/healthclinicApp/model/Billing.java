package com.healthclinicApp.model;

public class Billing {

    private int bill_id;
    private int patient_id;
    private double amount;
    private String payment_status;
    private String bill_date;

    public Billing() {
    }

    public Billing(int bill_id, int patient_id, double amount,
                   String payment_status, String bill_date) {

        this.bill_id = bill_id;
        this.patient_id = patient_id;
        this.amount = amount;
        this.payment_status = payment_status;
        this.bill_date = bill_date;
    }

    public int getBill_id() {
        return bill_id;
    }

    public void setBill_id(int bill_id) {
        this.bill_id = bill_id;
    }

    public int getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPayment_status() {
        return payment_status;
    }

    public void setPayment_status(String payment_status) {
        this.payment_status = payment_status;
    }

    public String getBill_date() {
        return bill_date;
    }

    public void setBill_date(String bill_date) {
        this.bill_date = bill_date;
    }
}