package com.day07.artify;

public class User {

	String name;
	double walletBalance;
	
	User(String name, double walletBalance){
		this.name = name;
		if(walletBalance > 0)
		this.walletBalance = walletBalance;
	}
	
	public void display() {
	        System.out.println("User Name      : " + name);
	        System.out.println("Wallet Balance : ₹" + walletBalance);
	    }
}
