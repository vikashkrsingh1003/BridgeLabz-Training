import java.util.Scanner;

public class RemainderAndQuotients {

    // Method to find remainder and quotient
    public static int[] findRemainderAndQuotients (int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;

        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input numer and divisor
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = sc.nextInt();

        //Calling the method and Displaying results
        int[] result = findRemainderAndQuotients(number, divisor);
        System.out.println("Quotient: " + result[0]);
        System.out.println("Remainder: " + result[1]);

        sc.close();
    }
}
