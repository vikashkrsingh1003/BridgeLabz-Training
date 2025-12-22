import java.util.*;

public class FindFactors {

    public static int[] factorStoreInArray(int number) {

        //Count factors
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        //Create array of exact size
        int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    public static int sumOfFactors (int[] factors){
        
        int sum =0;
        for(int i=0; i<factors.length;i++){
              sum += factors[i];
        }
        return sum;
    }

    public static long productOfFactors(int[] factors) {

    long product = 1;
    for (int i = 0; i < factors.length; i++) {
        product *= factors[i];
    }
    return product;
   }

    public static double sumOfSquaresOfFactors(int[] factors) {
    double sum = 0;
    for (int i = 0; i < factors.length; i++) {
        sum += Math.pow(factors[i], 2);
    }
    return sum;
 }



    public static void main(String[] args) {
        //Take the input number from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();

        //Calling the method and Displaying results
        int[] factors = factorStoreInArray(number);

        System.out.println("Factors of " + number + ":");
        for (int i = 0; i < factors.length; i++) {
            System.out.print(factors[i] + " ");
        }

        System.out.println("\nSum of factors: " + sumOfFactors(factors));
        System.out.println("Product of factors: " + productOfFactors(factors));
        System.out.println("Sum of squares of factors: " + sumOfSquaresOfFactors(factors));
    }
}
