package com.extra.stringmanupulation;
import java.util.*;

public class LexicalTwist {

    
    public static boolean validation(String str) {

        String[] check = str.split("\\s+");

        if (check.length > 1) {
            System.out.println(str + " is an invalid word");
            return false;   
        }
        return true;
    }

   
    public static boolean isReverse(String first, String second) {
    	
        String rev = new StringBuilder(first).reverse().toString();
        return rev.equalsIgnoreCase(second);
    }

  
    public static boolean isVowel(char ch) {
        ch = Character.toUpperCase(ch);
        return ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first word");
        String first = sc.nextLine();
        if (!validation(first))
        	return;

        System.out.println("Enter the second word");
        String second = sc.nextLine();
        if (!validation(second))
        	return;

        
        if (isReverse(first, second)) {

            String result = new StringBuilder(first).reverse().toString().toLowerCase();

            result = result.replaceAll("[aeiou]", "@");
            System.out.println(result);
        }
        else {

            String combined = (first + second).toUpperCase();

            int vowelCount = 0, consonantCount = 0;

            for (char ch : combined.toCharArray()) {
                if (isVowel(ch)) vowelCount++;
                else consonantCount++;
            }

            if (vowelCount > consonantCount) {
            	
                LinkedHashSet<Character> set = new LinkedHashSet<>();
                for (char ch : combined.toCharArray()) {
                    if (isVowel(ch)) 
                    	set.add(ch);
                    if (set.size() == 2)
                    	break;
                }
                for (char c : set)
                	System.out.print(c);
            }
            else if (consonantCount > vowelCount) {
                LinkedHashSet<Character> set = new LinkedHashSet<>();
                for (char ch : combined.toCharArray()) {
                    if (!isVowel(ch)) 
                    	set.add(ch);
                    if (set.size() == 2) 
                    	break;
                }
                for (char c : set) 
                	System.out.print(c);
            }
            else {
                System.out.println("Vowels and consonants are equal");
            }
        }

        sc.close();
    }
}
