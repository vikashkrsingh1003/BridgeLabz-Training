import java.util.Scanner;

public class NumberCheckerFour {

    //Method to Check if a number is a Prime Number
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false; 
        }
        return true;
    }

    //Method to Check if a number is a Neon Number
    // Sum of digits of (number squared) == number
    public static boolean isNeon(int number) {
        int square = number * number;
        int sumOfDigits = 0;
        while (square > 0) {
            sumOfDigits += square % 10; 
            square /= 10;               
        }
        return sumOfDigits == number;
    }

    //Method to Check if a number is a Spy Number
    // Sum of digits == Product of digits
    public static boolean isSpy(int number) {
        int sum = 0;
        int product = 1;
        int temp = Math.abs(number);
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        return sum == product;
    }

    //Method to Check if a number is an Automorphic Number
    //The square ends with the number itself (e.g., 5^2 = 25)
    public static boolean isAutomorphic(int number) {
		if (number < 0) return false;
		if (number == 0) return true;

		int square = number * number;
		int temp = number;

		// We loop the original number has digits to check
		while (temp > 0) {
			if (temp % 10 != square % 10) {
				return false; 
			}
			temp = temp / 10;
			square = square / 10;
		}

		return true;
	}

    // Method to Check if a number is a Buzz Number
    // Divisible by 7 OR ends with 7
    public static boolean isBuzz(int number) {
        return (number % 7 == 0) || (number % 10 == 7);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int input = sc.nextInt();

        System.out.println("Prime:       " + isPrime(input));
        System.out.println("Neon:        " + isNeon(input));
        System.out.println("Spy:         " + isSpy(input));
        System.out.println("Automorphic: " + isAutomorphic(input));
        System.out.println("Buzz:        " + isBuzz(input));

        sc.close();
    }
}