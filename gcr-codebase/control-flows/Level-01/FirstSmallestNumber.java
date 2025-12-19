import java.util.*;

public class FirstSmallestNumber {
    public static void main(String args[]) {
        
        //Take input three number from user
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        
        //Check if the first number is the smallest and display
       if (number1 < number2 && number1 < number3) {
            System.out.println("Is the first number the smallest? Yes");
        } else {
            System.out.println("Is the first number the smallest? No");
        }
        
    }
}
