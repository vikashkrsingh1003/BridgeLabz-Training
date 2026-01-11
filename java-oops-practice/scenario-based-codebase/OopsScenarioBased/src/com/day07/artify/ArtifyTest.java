package com.day07.artify;

public class ArtifyTest {

	public static void main(String[] args) {
		
	  PrintArt a = new PrintArt("The Pool", "Zara H", 1000);
	  User u1 = new User("Saurav Singh", 200);
	  
	  a.display();
	  a.purchase(u1);
	  a.license();
	  u1.display();
	}

}
