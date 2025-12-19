import java.util.*;
public class FindFactors {
    public static void main(String args[]) {
        
        //Take the input number from user 
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        // Create arrays for store factor and index variable
        int maxFactor =10;
        int[] factors = new int[maxFactor];
        int index = 0;

        // Find factors using for loop
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {

                //if array is full, resize it
                if (index == maxFactor) {
                    maxFactor = maxFactor * 2;
                    int[] temp = new int[maxFactor];

                    //copy old elements to new temp array
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }

                    factors = temp;
                }

                // Store factor
                factors[index] = i;
                index++;
            }
        }

        // Display factors
        System.out.println("Factors of " + number + ":");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }

       

    }
}