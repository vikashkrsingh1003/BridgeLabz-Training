package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceSpaces {

	public static void main(String[] args) {

		    String regex = " +";
			
			Pattern pattern = Pattern.compile(regex);
			
			String input = "This        is an example           with multiple spaces.";

			Matcher matcher = pattern.matcher(input);
			
			System.out.println(matcher.replaceAll(" "));
	}

}
