package com.objectmodel.level1.bankaccholder;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank("National Bank");

        Customer alice = new Customer("Alice");
        Customer bob = new Customer("Bob");

        // Association: customers open accounts in the bank
        Account a1 = bank.openAccount(alice);
        Account a2 = bank.openAccount(alice);
        Account b1 = bank.openAccount(bob);

        // Transactions
        a1.deposit(500);
        a2.deposit(1200);
        b1.deposit(300);

        // Customers view balances
        alice.viewBalance();
        bob.viewBalance();
    }
}
