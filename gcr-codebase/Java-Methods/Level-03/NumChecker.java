import java.util.Scanner;

public class NumChecker {

    // Method to find sum of proper divisors
    public static int sumOfProperDivisors(int n) {
        int sum = 0;

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    // Perfect Number
    public static boolean isPerfectNumber(int n) {
        if (n <= 0) return false;
        return sumOfProperDivisors(n) == n;
    }

    // Abundant Number
    public static boolean isAbundantNumber(int n) {
        if (n <= 0) return false;
        return sumOfProperDivisors(n) > n;
    }

    // Deficient Number
    public static boolean isDeficientNumber(int n) {
        if (n <= 0) return false;
        return sumOfProperDivisors(n) < n;
    }

    // Factorial method (helper for strong number)
    public static int factorial(int digit) {
        int fact = 1;
        for (int i = 1; i <= digit; i++) {
            fact *= i;
        }
        return fact;
    }

    // Strong Number
    public static boolean isStrongNumber(int n) {
        int original = n;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += factorial(digit);
            n = n / 10;
        }
        return sum == original;
    }

    // main method
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = s.nextInt();

        System.out.println("Perfect Number: " + isPerfectNumber(number));
        System.out.println("Abundant Number: " + isAbundantNumber(number));
        System.out.println("Deficient Number: " + isDeficientNumber(number));
        System.out.println("Strong Number: " + isStrongNumber(number));
    }
}
