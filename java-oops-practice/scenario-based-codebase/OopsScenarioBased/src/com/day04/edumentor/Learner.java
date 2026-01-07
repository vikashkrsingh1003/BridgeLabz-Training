package com.day04.edumentor;

public class Learner extends User implements ICertifiable {

    public Learner(String name, String email, String userId) {
        super(name, email, userId);
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Learner");
    }

    // Polymorphism: short course certificate
    @Override
    public String generateCertificate() {
        return "Short Course Certificate awarded to " + name;
    }
}

