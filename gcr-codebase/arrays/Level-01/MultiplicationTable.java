import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

       //Take the  input number
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        //Define integer array table to store multiplication results (1 to 10)
        int[] table = new int[10];

        // Store results in array table
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }

        // Display the multiplication table
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }

        sc.close();
    }
}
