package com.healthclinicApp.model;

public class VisitHistory {

    private int visit_id;
    private int patient_id;
    private int doctor_id;
    private String diagnosis;
    private String prescription;
    private String visit_date;

    public VisitHistory() {
    }

    public VisitHistory(int visit_id, int patient_id, int doctor_id,
                        String diagnosis, String prescription,
                        String visit_date) {

        this.visit_id = visit_id;
        this.patient_id = patient_id;
        this.doctor_id = doctor_id;
        this.diagnosis = diagnosis;
        this.prescription = prescription;
        this.visit_date = visit_date;
    }

    public int getVisit_id() {
        return visit_id;
    }

    public void setVisit_id(int visit_id) {
        this.visit_id = visit_id;
    }

    public int getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }

    public int getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(int doctor_id) {
        this.doctor_id = doctor_id;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    public String getVisit_date() {
        return visit_date;
    }

    public void setVisit_date(String visit_date) {
        this.visit_date = visit_date;
    }
}