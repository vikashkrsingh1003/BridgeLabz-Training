import java.util.Scanner;

public class NumberChecker2 {

    // Method to find the count of digits in the number
    public static int getDigitCount(int number) {
        if (number == 0) return 1;
        return String.valueOf(Math.abs(number)).length();
    }

    // Method to Store the digits of the number in a digits array
    public static int[] getDigitsArray(int number) {
        int count = getDigitCount(number);
        int[] digits = new int[count];
        int temp = Math.abs(number);
        
        // Fill array from right to left
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        return digits;
    }

    // Method to find the sum of the digits using the digits array
    public static int getSumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += d;
        }
        return sum;
    }

    // Method to find the sum of the squares of the digits
    public static double getSumOfSquares(int[] digits) {
        double sumSquares = 0;
        for (int d : digits) {
            sumSquares += Math.pow(d, 2);
        }
        return sumSquares;
    }

    // Method to Check if a number is a Harshad number
    public static boolean isHarshadNumber(int originalNumber, int[] digits) {
        int sum = getSumOfDigits(digits);
        if (sum == 0) return false; 
        return originalNumber % sum == 0;
    }

    // Method to find the frequency of each digit using a 2D array
    public static int[][] getDigitFrequency(int[] digits) {
        // First, count occurrences of 0-9
        int[] counts = new int[10];
        int uniqueCount = 0;
        for (int d : digits) {
            if (counts[d] == 0) uniqueCount++;
            counts[d]++;
        }

        // Create 2D array: First column = Digit, Second column = Frequency
        int[][] frequencyMap = new int[uniqueCount][2];
        int rowIndex = 0;
        for (int i = 0; i < 10; i++) {
            if (counts[i] > 0) {
                frequencyMap[rowIndex][0] = i;
                frequencyMap[rowIndex][1] = counts[i];
                rowIndex++;
            }
        }
        return frequencyMap;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = sc.nextInt();

        int[] digits = getDigitsArray(input);

        System.out.println("Digit Count: " + digits.length);
        System.out.println("Sum of Digits: " + getSumOfDigits(digits));
        System.out.println("Sum of Squares: " + (int)getSumOfSquares(digits));
        System.out.println("Is Harshad Number: " + isHarshadNumber(input, digits));

        System.out.println("Digit Frequency (Digit | Frequency):");
        int[][] freq = getDigitFrequency(digits);
        for (int[] row : freq) {
            System.out.println("  " + row[0] + " | " + row[1]);
        }

        sc.close();
    }
}