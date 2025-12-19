import java.util.*;

public class PrimeNumber {
    public static void main(String args[]){

    //Take the input number from the user
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    boolean isPrime = true;

    //Check if the number is greater than 1 and else checking the false condition
    if(number <= 1){
        isPrime = false;
    }
    else{
        for(int i = 2; i < number; i++){
            if(number % i == 0){
                isPrime = false;
                break;
            }
        }
    }

    //check isPrime true or false and Display the result
    if(isPrime){
        System.out.println("Prime Number");
    }
    else{
        System.out.println("Not a Prime Number");
    }
    }
}
