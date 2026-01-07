package com.day05.loanbuddy;

public class Applicant {
    private String name;
    private int creditScore;
    private double income;
    private double loanAmount;

    public Applicant(String name, int creditScore, double income, double loanAmount) {
        this.name = name;
        this.creditScore = creditScore;
        this.income = income;
        this.loanAmount = loanAmount;
    }

    public String getName() {
        return name;
    }

    public double getIncome() {
        return income;
    }

    public double getLoanAmount() {
        return loanAmount;
    }
    // Credit score intentionally hidden
    int getCreditScoreInternal() {
        return creditScore;
    }
}

