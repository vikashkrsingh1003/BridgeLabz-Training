//creating a class named FindFrequency purpose to find frequency of each digit in a number
import java.util.Scanner;

class FindFrequency {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for a number from user 
        int number = sc.nextInt();

        //Find the count of digits using while loop
        int originalNumber = number;
        int count = 0;
        while (originalNumber != 0) {
            originalNumber = originalNumber / 10;
            count++;
        }

        //Create array to store digits
        int[] digits = new int[count];
        originalNumber = number;
        for (int i = 0; i < count; i++) {
            digits[i] = originalNumber % 10;
            originalNumber = originalNumber / 10;
        }

        //Finding frequency of each digit
        int[] frequency = new int[10];
        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }

        //Print frequency of each digit
        System.out.println("\nDigit frequency is:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " times ");
            }
        }

        sc.close();
    }
}
