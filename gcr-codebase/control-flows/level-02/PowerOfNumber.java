import java.util.*;

public class PowerOfNumber {
    public static void main(String args[]){

    //Get the input from the user
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int power = sc.nextInt();

    //Calculate power using for loop
    int result = 1;
    for(int i = 1; i <= power; i++){
        result = result * number;
    }

    System.out.println(result);
    }
}
