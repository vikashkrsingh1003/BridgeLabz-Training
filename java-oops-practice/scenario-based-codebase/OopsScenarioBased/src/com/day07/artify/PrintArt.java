package com.day07.artify;

public class PrintArt  extends ArtWork implements IPurchasable{

	public PrintArt(String title, String artist, double price) {
		super(title, artist, price, "Personal");
	}

	@Override
	public void purchase(User u){
		
		if(u.walletBalance >= getPrice()) {
		   u.walletBalance -= getPrice();
		   System.out.println("Thank you for purchasing Print ArtWork");
		   System.out.println("Deducted Amount :" + getPrice());
		}
		else {
			   System.out.println("Not sufficent Balance");
		}	
	}
	
	protected  void licenseTerms() {
		System.out.println("1. The artwork is licensed, not sold; ownership remains with the artist.");
		System.out.println("2. Redistribution, resale, or sharing of the original digital file is prohibited.");
		System.out.println("3. Modification is allowed only if explicitly permitted by the selected license type.");
		System.out.println("4. The license is valid for the specified period and expires after that.");
	}
	
	@Override 
	public void license() {
		   System.out.println("------------------------------------");
		   System.out.println(licenseType +  " license for Digital ArtWork");
		   System.out.println("License Terms and conditions are: ");
		   licenseTerms();
	}
}
