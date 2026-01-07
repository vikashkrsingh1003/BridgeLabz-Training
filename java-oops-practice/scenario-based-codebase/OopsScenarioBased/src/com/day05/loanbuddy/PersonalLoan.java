package com.day05.loanbuddy;

public class PersonalLoan extends LoanApplication {

    public PersonalLoan(Applicant applicant, int term) {
        super(applicant, term, 0.15);
    }

    @Override
    public boolean approveLoan() {
        boolean status = basicEligibilityCheck();
        setApproved(status);
        return status;
    }

    @Override
    public double calculateEMI() {
        return emiFormula();
    }

    protected double emiFormula() {
        double P = applicant.getLoanAmount();
        double R = interestRate / 12;
        int N = term;

        return (P * R * Math.pow(1 + R, N)) /
               (Math.pow(1 + R, N) - 1);
    }
}

