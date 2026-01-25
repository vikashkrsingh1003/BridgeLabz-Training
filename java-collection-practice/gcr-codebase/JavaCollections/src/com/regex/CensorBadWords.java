package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CensorBadWords {

	public static void main(String[] args) {

		String[] badWords = {"damn", "stupid"};
		
		String input = "This is a damn bad example with some stupid words.";
		
		String output = input;
		
		for(String word: badWords) {
		String regex = "\\b" + word + "\\b";
		Pattern pattern = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(output);
		
		output = matcher.replaceAll("*****");
		}
		System.out.println(output);
	}

}
