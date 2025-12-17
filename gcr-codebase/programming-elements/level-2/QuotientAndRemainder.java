import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {

        //Take input two numbers from user
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        // Calculate quotient and remainder
        int quotient = number1 / number2;
        int remainder = number1 % number2;

        // Print the quotient and remainder
        System.out.println("The Quotient is " + quotient +" and Reminder is " + remainder +
            " of two number " + number1 + " and " + number2 );
    }
}
