import java.util.*;

public class ArmstrongNumber {
    public static void main(String args[]){

    //Get the input from the user
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();

    int sum = 0;
    int originalNumber = number;

    //Find sum of cubes of digits
    while(originalNumber != 0){
        int digit = originalNumber % 10;
        sum = sum + (digit * digit * digit);
        originalNumber = originalNumber / 10;
    }

    //Check if Armstrong number
    if(sum == number){
        System.out.println("Armstrong Number");
    }
    else{
        System.out.println("Not an Armstrong Number");
    }
  }
 }
