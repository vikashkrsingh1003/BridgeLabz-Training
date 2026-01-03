package com.day02.ewalletapp;

public class EWalletApp {
    public static void main(String[] args) {

        User user1 = new User("Shubham", false, true);
        User user2 = new User("Saurav", true, false);

        user1.getWallet().credit(3000);
        user2.getWallet().credit(10000);

        user1.getWallet().transferTo(user2, 2000);
        user2.getWallet().transferTo(user1, 4000);

        System.out.println("\nShubham Balance: " + user1.getWallet().getBalance());
        System.out.println("Saurav Balance: " + user2.getWallet().getBalance());

        System.out.println("\nShubham Transaction History:");
        user1.getWallet().showHistory();
    }
}

