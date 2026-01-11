package com.day07.artify;

public class ArtWork {

	private String title;
	private String artist;
	private double price;
	protected String licenseType;
	
	public ArtWork(String title, String artist, double price, String licenseType) {
		this.title = title;
		this.artist = artist;
		this.price = price;
		this.licenseType = licenseType;
	}
	
	public double getPrice()
	{
	 return price;	
	}
	
	public void display() {
		System.out.println("Title :" + title);
		System.out.println("Artist :" + artist);
		System.out.println("Price :" + price);
		System.out.println("LicenseType :" + licenseType);
		System.out.println("------------------------");

	}
	
}
