package com.regex;

import java.util.regex.*;

public class UsernameValidator {

	public static void main(String[] args) {

		String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";
		
		Pattern pattern = Pattern.compile(regex);
		
		String input = "user_123";
		Matcher matcher = pattern.matcher(input);
		
		if(matcher.matches())
			System.out.println("Valid username");
		else
			System.out.println("Invalid username");
		
	}

}
