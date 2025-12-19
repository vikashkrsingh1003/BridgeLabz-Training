import java.util.*;
public class DivisibleByFive{
public static void main(String args[]){
        
        //Take the input number from user
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        
        //Check if the number is divisible by 5 and display
        if (number % 5 == 0) {
            System.out.println("Is the number " + number + " divisible by 5? Yes");
        } else {
            System.out.println("Is the number " + number + " divisible by 5? No");
        }
        
  } 
}