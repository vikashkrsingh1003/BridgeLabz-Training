package com.day04.edumentor;

public class FullTimeLearner extends Learner {

    public FullTimeLearner(String name, String email, String userId) {
        super(name, email, userId);
    }

    // Polymorphism: full-time certificate
    @Override
    public String generateCertificate() {
        return "Full-Time Program Certificate awarded to " + name;
    }
}
