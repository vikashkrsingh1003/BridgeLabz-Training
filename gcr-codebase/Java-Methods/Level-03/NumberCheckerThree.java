import java.util.Scanner;
import java.util.Arrays;

public class NumberCheckerThree {

    //Method to count how many digits are in a number
    public static int getDigitCount(int number) {
        if (number == 0) return 1;
        int temp = number;
        int count = 0;
        while (temp > 0) {
            temp = temp / 10;
            count++;
        }
        return count;
    }

    // Method to break the number into an array of digits
    public static int[] getDigitsArray(int number) {
        int count = getDigitCount(number);
        int[] digits = new int[count];
        int temp = number;
        
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp = temp / 10;
        }
        return digits;
    }

    // Method to create a reversed version of the digits array
    public static int[] reverseArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // Method to check if two arrays are exactly the same
    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    // 5. Method to check if a number is a Palindrome
    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseArray(digits);
        return areArraysEqual(digits, reversed);
    }

    // 6. Method to check for a Duck Number
    public static boolean isDuckNumber(int[] digits) {
        for (int d : digits) {
            if (d != 0) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = sc.nextInt();

        // digits array
        int[] digits = getDigitsArray(input);

        //print results
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Is Palindrome? " + isPalindrome(digits));
        System.out.println("Is Duck Number? " + isDuckNumber(digits));

        sc.close();
    }
}