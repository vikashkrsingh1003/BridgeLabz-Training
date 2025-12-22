// Creating a class named ReverseNumber purpose ot reverse a number 
import java.util.Scanner;

class ReverseNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking a number as input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        //count digits using while loop
        int originalNumber = number;
        int count = 0;
        while (originalNumber != 0) {
            originalNumber = originalNumber / 10;
            count++;
        }

        //create array to store each digits 
        int[] digits = new int[count];
        originalNumber = number;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = originalNumber % 10;
            originalNumber = originalNumber / 10;
        }

        //create array to store and reverse the digits using for-loop
        int[] reverseDigits = new int[count];
        for (int i = 0; i < count; i++) {
            reverseDigits[i] = digits[count - 1 - i];
        }

        //print the reversed number
        System.out.print("Reversed number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(reverseDigits[i]);
        }

       sc.close();
    }
}
