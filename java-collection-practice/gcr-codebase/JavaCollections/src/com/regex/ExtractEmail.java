package com.regex;

import java.util.regex.*;

public class ExtractEmail {

	public static void main(String[] args) {

		String regex = "[a-z]+@[a-z]+\\.[a-z]{2,}";
		
		Pattern pattern = Pattern.compile(regex);
		
		String input = "Contact us at support@example.com and info@company.org";
		
		Matcher matcher = pattern.matcher(input);
		
		while(matcher.find())
		{
			System.out.println(matcher.group());
		}
	}

}
