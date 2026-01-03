package com.day02.ewalletapp;

public class User {
    private String name;
    private Wallet wallet;

    public User(String name, boolean isBusiness, boolean referral) {
        this.name = name;
        double bonus = referral ? 100 : 0;

        if (isBusiness) {
            wallet = new BusinessWallet(bonus);
        } else {
            wallet = new PersonalWallet(bonus);
        }
    }

    public Wallet getWallet() {
        return wallet;
    }

    public String getName() {
        return name;
    }
}

