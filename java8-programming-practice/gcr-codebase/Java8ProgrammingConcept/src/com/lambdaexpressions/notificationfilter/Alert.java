package com.lambdaexpressions.notificationfilter;

public class Alert {

    private String message;
    private String type;   //emergancy, Appointment,Medicinne

    public Alert(String message, String type) {
        this.message = message;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return " type -->  " + message;
    }
}
