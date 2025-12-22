//Creating a class named FindLargestAndSecondLargest purpose to find the largest and second largest digit
import java.util.Scanner;

class LargestAndSecondLargestDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking number as input from user 
        int number = sc.nextInt();

        //create maxdigit variable and array
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        //using while loop to store each digits in array
        while (number != 0) {
            if (index == maxDigit) {
                break;
            }
            digits[index] = number % 10;
            number = number / 10;      
            index++;             
        }

        //Finding largest and seconlargest number
        int largest = 0;
        int secondLargest = 0;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } 
            else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        //Displaying results largest and second largest
        System.out.println("Largest number is : " + largest);
        System.out.println("Second largest number is : " + secondLargest);

        sc.close();
    }
}
