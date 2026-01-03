package com.day02.ewalletapp;

public class PersonalWallet extends Wallet {

    private static final double TRANSFER_LIMIT = 5000;

    public PersonalWallet(double bonus) {
        super(bonus);
    }

    @Override
    public void transferTo(User receiver, double amount) {
        if (amount > TRANSFER_LIMIT) {
            System.out.println("Personal wallet transfer limit exceeded");
            return;
        }

        if (debit(amount)) {
            receiver.getWallet().credit(amount);
            System.out.println("Transfer successful (Personal Wallet)");
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

