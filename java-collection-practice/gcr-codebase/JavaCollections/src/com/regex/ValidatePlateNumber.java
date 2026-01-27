package com.regex;

import java.util.regex.*;

public class ValidatePlateNumber {

	public static void main(String[] args) {

		String regex = "^[A-Z]{2}[0-9]{4}$";

		Pattern pattern = Pattern.compile(regex);

		String input = "AB0123";
		Matcher matcher = pattern.matcher(input);

		if (matcher.matches())
			System.out.println("Valid Number");
		else
			System.out.println("Invalid Number");

	}

}
