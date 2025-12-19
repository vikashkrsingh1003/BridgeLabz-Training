import java.util.*;

public class GreatestFactor2 {
    public static void main(String args[]){

    //Get the input from the user
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int greatestFactor = 1;

    //Find greatest factor using while loop
    int counter = number - 1;
    while(counter >= 1){
        if(number % counter == 0){
            greatestFactor = counter;
            break;
        }
        counter--;
    }

    System.out.println(greatestFactor);
    }
}
