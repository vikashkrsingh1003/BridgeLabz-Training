package com.day02.ewalletapp;

public class BusinessWallet extends Wallet {

    private static final double TRANSFER_LIMIT = 50000;
    private static final double TAX = 0.02;

    public BusinessWallet(double bonus) {
        super(bonus);
    }

    @Override
    public void transferTo(User receiver, double amount) {
        double taxAmount = amount * TAX;
        double totalAmount = amount + taxAmount;

        if (amount > TRANSFER_LIMIT) {
            System.out.println("Business wallet transfer limit exceeded");
            return;
        }

        if (debit(totalAmount)) {
            receiver.getWallet().credit(amount);
            System.out.println("Transfer successful (Business Wallet)");
            System.out.println("Tax deducted: Rs: " + taxAmount);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

