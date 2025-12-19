import java.util.Scanner;

public class MultiplicationTable6to9 {
    public static void main(String[] args) {


        //Define integer array table to store multiplication results (1 to 10)
        int[] table = new int[10];
        
        //Loop for numbers 6 to 9
        for (int number = 6; number <= 9; number++) {
                 System.out.println("Multiplication Table of " + number);

            //Store multiplication results from 1 to 10
           for (int i = 1; i <= 10; i++) {
              table[i - 1] = number * i;
           }
        
        // Display the multiplication table
        for (int i = 1; i <= 10; i++) {
            System.out.println( number + " * " + i + " = " + table[i - 1]);
        }
    }
        //sc.close();
    }
}
