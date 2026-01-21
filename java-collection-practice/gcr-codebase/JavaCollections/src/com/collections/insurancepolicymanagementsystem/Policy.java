package com.collections.insurancepolicymanagementsystem;

import java.time.LocalDate;

public class Policy {

	private int policyNumber;
	private String policyholderName;
	private LocalDate expiryDate;
	
	public Policy(int policyNumber, String policyholderName, String expiryDate)
	{
		this.policyNumber = policyNumber;
		this.expiryDate = LocalDate.parse(expiryDate);
		this.policyholderName = policyholderName;
	}
	
	public int getPolicyNumber() {return policyNumber;}
	public LocalDate getExpiryDate() {return expiryDate;}
	public String getName() {return policyholderName;}
	
	 @Override
	    public String toString() {
	        return policyNumber + " | " + policyholderName + " | " + expiryDate;
	    }
}
