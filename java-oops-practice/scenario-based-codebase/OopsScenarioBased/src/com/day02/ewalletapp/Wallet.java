package com.day02.ewalletapp;

import java.util.ArrayList;
import java.util.List;

public abstract class Wallet implements Transferrable {

    private double balance; // Encapsulation
    protected List<Transaction> transactions = new ArrayList<>();

    public Wallet(double initialBalance) {
        balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    protected void credit(double amount) {
        balance += amount;
        transactions.add(new Transaction("Credit", amount));
    }

    protected boolean debit(double amount) {
        if (balance >= amount) {
            balance -= amount;
            transactions.add(new Transaction("Debit", amount));
            return true;
        }
        return false;
    }

    public void showHistory() {
        for (Transaction t : transactions) {
            t.display();
        }
    }
}
