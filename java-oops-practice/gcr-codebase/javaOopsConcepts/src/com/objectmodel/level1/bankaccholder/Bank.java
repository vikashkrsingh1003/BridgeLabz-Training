package com.objectmodel.level1.bankaccholder;

import java.util.ArrayList;

public class Bank {
    private String bankName;
    private ArrayList<Customer> customers;
    private int nextAccountNumber = 1001;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    public String getBankName() {
        return bankName;
    }

    public Account openAccount(Customer customer) {
        Account account = new Account(nextAccountNumber++, this);
        customers.add(customer);
        customer.addAccount(account);
        return account;
    }
}

