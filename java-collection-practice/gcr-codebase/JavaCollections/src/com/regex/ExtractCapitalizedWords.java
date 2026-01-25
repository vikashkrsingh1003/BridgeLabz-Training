package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCapitalizedWords {

	public static void main(String[] args) {

        String regex = "[A-Z]+[a-z]*";
		
		Pattern pattern = Pattern.compile(regex);
		
		String input ="The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
		
		Matcher matcher = pattern.matcher(input);
		
		while(matcher.find())
		{
			 String word = matcher.group();
			    if (!word.equals("The") && !word.equals("A") && !word.equals("An")) {
			        System.out.println(word);
			    }
		}
	}

}
