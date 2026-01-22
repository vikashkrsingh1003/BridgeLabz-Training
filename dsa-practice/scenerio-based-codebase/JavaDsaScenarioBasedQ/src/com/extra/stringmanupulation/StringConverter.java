package com.extra.stringmanupulation;

import java.util.*;
public class StringConverter {
  
	public static String CleanseAndInvert(String input) {
		
		String str = input.toLowerCase();
		if(input == null || input.length() < 6) {
			System.out.println("Invalid input");
		}
		
		String res = "";
		for(int i=0; i<str.length(); i++) {
			
			 char ch = str.charAt(i);

	            if (ch < 'a' || ch > 'z') {
	                return "";
	            }
			
			if(ch % 2 != 0 ) {
				
			   res = ch+ res;  //reverse string 
				
		   }
		}
		
		String finalstring = "";
		
		for(int i=0; i<res.length(); i++) {
			
			if(i % 2 == 0) {
				int ascii = ((int)res.charAt(i)) - 32;
				finalstring += (char)ascii;
				
			}else {
			   finalstring += res.charAt(i);
			}
		}
		return finalstring;
	
	}
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word :");
		String word = sc.nextLine();
	    String result = CleanseAndInvert(word); 
		
	    if(result == "") {
	    	System.out.println("Invalid output");
	    }else {
		System.out.println("After manupulate the words :-->"+CleanseAndInvert(word));
	    }
	 
	}
	   
}
