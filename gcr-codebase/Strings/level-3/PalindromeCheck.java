import java.util.Scanner;

public class PalindromeCheck {

    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false; 
            }
            start++;
            end--;
        }
        return true; 
    }
     
    // Recursive method
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true; 
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false; 
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    //Using character array and reversal
    public static boolean isPalindromeUsingArray(String text) {
        int len = text.length();
        char[] original = text.toCharArray();
        char[] reverse = new char[len];

        // Create reversed array
        for (int i = 0; i < len; i++) {
            reverse[i] = text.charAt(len - 1 - i);
        }

        // Compare original and reverse
        for (int i = 0; i < len; i++) {
            if (original[i] != reverse[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        // Iterative check
        boolean resultIterative = isPalindromeIterative(text);
        System.out.println("Palindrome check (Iterative): " + resultIterative);

        // Recursive check
        boolean resultRecursive = isPalindromeRecursive(text, 0, text.length() - 1);
        System.out.println("Palindrome check (Recursive): " + resultRecursive);

        // Character array check
        boolean resultArray = isPalindromeUsingArray(text);
        System.out.println("Palindrome check (Using array): " + resultArray);

        sc.close();
    }
}
