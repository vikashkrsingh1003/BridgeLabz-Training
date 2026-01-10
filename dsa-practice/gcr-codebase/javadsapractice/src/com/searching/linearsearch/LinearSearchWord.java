package com.searching.linearsearch;

import java.util.Scanner;


	public class LinearSearchWord {

	    //Method that performs Linear Search to find word
	    public static boolean linearSearch(String sentence, String word) {
	        String[] words = sentence.split(" ");
	        
	        for (int i = 0; i < words.length; i++) {
	            if (words[i].equals(word)) {
	                return true; // word found
	            }
	        }
	        return false; // word not found
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a sentence: ");
	        String sentence = sc.nextLine();

	        System.out.print("Enter a word to search: ");
	        String word = sc.nextLine();

	        boolean result = linearSearch(sentence, word);

	        // Output
	        if (result) {
	        	System.out.println("=============================");
	            System.out.println("Word found in the sentence");
	        	System.out.println("=============================");
	           
	        } else {
	        	System.out.println("=============================");
	            System.out.println("Not Found");
	        	System.out.println("=============================");
	        }

	        sc.close();
	    }
	}
