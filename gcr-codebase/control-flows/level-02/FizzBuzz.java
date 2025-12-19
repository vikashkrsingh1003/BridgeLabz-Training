import java.util.*;
public class FizzBuzz {
    public static void main(String args[]){

      //Take the input number from user
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
       
    //check the number is positive and Iterate the loop until hit the number and check the condition and print the result
        if(number>0){
                for (int i = 1; i <= number; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }

            }
        }
    }
}