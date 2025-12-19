import java.util.*;

public class NaturalNumSum {
    public static void main(String args[]) {
        
        //Take input number from user
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        
        // Check if natural number and display sum
        if (number > 0) {
            int sum = number * (number + 1) / 2;
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }
        
    }
}
