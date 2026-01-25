package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateHexColorcode {

	public static void main(String[] args) {

		String regex = "^#[0-9A-Fa-f]{6}$";
		
		Pattern pattern = Pattern.compile(regex);
		
		String input = "#AB0123";
		Matcher matcher = pattern.matcher(input);
		
		if(matcher.matches())
			System.out.println("Valid");
		else
			System.out.println("Invalid");
		
	}
}
