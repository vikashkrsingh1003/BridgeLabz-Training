package com.day05.loanbuddy;

public abstract class LoanApplication implements IApprovable {
	
    protected Applicant applicant;
    protected int term; 
    protected double interestRate;
    private boolean approved;

    public LoanApplication(Applicant applicant, int term, double interestRate) {
        this.applicant = applicant;
        this.term = term;
        this.interestRate = interestRate;
    }

    protected boolean basicEligibilityCheck() {
        return applicant.getCreditScoreInternal() >= 650 && applicant.getIncome() >= (applicant.getLoanAmount() / 10);
    }

    protected void setApproved(boolean status) {
        this.approved = status;
    }

    public boolean isApproved() {
        return approved;
    }
}
