package com.inheritance.hierarchicalinheritance.bankacctypes;

public class Main {
    public static void main(String[] args) {

        BankAccount savings = new SavingsAccount("S1001", 5000, 5.0);
        BankAccount checking = new CheckingAccount("C2001", 2000, 1000);
        BankAccount fixedDeposit = new FixedDepositAccount("F3001", 10000, 12);

        savings.displayAccountType();
        System.out.println();
        checking.displayAccountType();
        System.out.println();
        fixedDeposit.displayAccountType();
    }
}

