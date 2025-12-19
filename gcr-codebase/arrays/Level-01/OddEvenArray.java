import java.util.Scanner;

public class OddEvenArray {
    public static void main(String[] args) {
       //Take the input number from user 
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        // Check for natural number
        if (number <= 0) {
            System.out.println("Please enter a natural number ");
            return;
        }

        // Create arrays for odd and even numbers and index variable
        int[] even = new int[number / 2 + 1];
        int[] odd = new int[number / 2 + 1];

        int evenIndex = 0;
        int oddIndex = 0;

        //for loop from 1 to number to check odd or even 
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                even[evenIndex] = i;
                evenIndex++;
            } else {
                odd[oddIndex] = i;
                oddIndex++;
            }
        }

        //Displaying the odd numbers
        System.out.println("\n Odd Numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(odd[i] + " ");
        }

        //Displaying the even numbers
        System.out.println("\nEven Numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(even[i] + " ");
        }

       
    }
}
