import java.util.*;
public class FizzBuzz2 {
    public static void main(String args[]){

      //Take the input number from user
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
       
    //check the number is positive and Iterate the loop until hit the number and check the condition and print the result
        if(number>0){
            int i=number;
                while(i>0){
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
               i--;
            }
        }
    }
}