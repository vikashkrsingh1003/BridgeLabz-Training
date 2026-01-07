package com.day05.loanbuddy;

public class HomeLoan extends LoanApplication {

    public HomeLoan(Applicant applicant, int term) {
        super(applicant, term, 0.08);
    }

    @Override
    public boolean approveLoan() {
        boolean status = basicEligibilityCheck() &&
                         applicant.getIncome() > 50000;
        setApproved(status);
        return status;
    }

    @Override
    public double calculateEMI() {
        return emiFormulaWithDiscount();
    }

    private double emiFormulaWithDiscount() {
        double P = applicant.getLoanAmount();
        double R = (interestRate - 0.01) / 12;
        int N = term;

        return (P * R * Math.pow(1 + R, N)) /
               (Math.pow(1 + R, N) - 1);
    }
}

