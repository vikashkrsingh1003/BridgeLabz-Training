package com.interfaces.defaultmethods.paymentgateway;

public class PaymentMain {
    public static void main(String[] args) {

        PaymentProcessor payment = new Paytm("Vaidik");

        payment.processPayment(500);
        payment.refund(200);
    }
}

