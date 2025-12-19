import java.util.*;

public class GreatestFactor {
    public static void main(String args[]){

    //Take the input from the user and initialize the gratest factor by 1
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int greatestFactor = 1;

    //Find greatest factor using for loop
    for(int i = number - 1; i >= 1; i--){
        if(number % i == 0){
            greatestFactor = i;
            break;
        }
    }

    System.out.println(greatestFactor);
    }
}
