import java.util.Scanner;

public class ArraySumUntilZero {
    public static void main(String[] args) {

        //Array of size 10 to store double values and Variable to store total sum
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        // Infinite while loop and Check for 0 or negative number 
        while (true) {
            double input = sc.nextDouble();
            if (input <= 0) {
                break;
            }
          // Check array size limit reached
            if (index == 10) {
                break;
            }

           numbers[index] = input;
            index++;
        }

        //calculate sum and  Display total
        for (int i = 0; i < index; i++) {

            total += numbers[i];
        }
        System.out.println("\nSum of all numbers :" + total);

        
    }
}
