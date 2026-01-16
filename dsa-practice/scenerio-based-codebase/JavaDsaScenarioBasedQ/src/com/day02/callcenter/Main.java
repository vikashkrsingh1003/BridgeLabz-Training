package com.day02.callcenter;

public class Main {
    public static void main(String[] args) {

        CallCenter callCenter = new CallCenter();

        callCenter.receiveCall(new Customer("C101", "Amit", false));
        callCenter.receiveCall(new Customer("C102", "Riya", true));
        callCenter.receiveCall(new Customer("C103", "Sohan", false));
        callCenter.receiveCall(new Customer("C102", "Riya", true));

        callCenter.handleCall(); 
        callCenter.handleCall();
        callCenter.handleCall();

        callCenter.displayCallCount();
    }
}
