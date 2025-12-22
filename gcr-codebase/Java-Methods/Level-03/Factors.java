import java.util.Scanner;

public class Factors {

    // Find factors and return as array
    public static int[] getFactors(int n) {

        // Step 1: Count factors
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        // Step 2: Store factors in array
        int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    // Find greatest factor
    public static int getGreatestFactor(int[] factors) {
        return factors[factors.length - 1];
    }

    //Find sum of factors
    public static int getSumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) {
            sum += f;
        }
        return sum;
    }

    //Find product of factors
    public static long getProductOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) {
            product *= f;
        }
        return product;
    }

    //Product of cube of factors
    public static double getProductOfCubeOfFactors(int[] factors) {
        double product = 1;
        for (int f : factors) {
            product *= Math.pow(f, 3);
        }
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Taking the input number from user 
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] factors = getFactors(number);

        System.out.println("\nFactors are:");
        for (int f : factors) {
            System.out.print(f + " ");
        }

        System.out.println("\n\nGreatest Factor: " + getGreatestFactor(factors));
        System.out.println("Sum of Factors: " + getSumOfFactors(factors));
        System.out.println("Product of Factors: " + getProductOfFactors(factors));
        System.out.println("Product of Cube of Factors: " + getProductOfCubeOfFactors(factors));
    }
}
