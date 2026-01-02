package com.inheritance.hierarchicalinheritance.bankacctypes;


public class FixedDepositAccount extends BankAccount {
    private int depositTerm; // in months

    public FixedDepositAccount(String accountNumber, double balance, int depositTerm) {
        super(accountNumber, balance);
        this.depositTerm = depositTerm;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
        System.out.println("Deposit Term: " + depositTerm + " months");
    }
}

