import java.util.*;

public class PowerOfNumber2 {
    public static void main(String args[]){

    //Take  the input number and power  from the user
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int power = sc.nextInt();

    //Calculate power using while loop
    int result = 1;
    int counter = 0;

    while(counter != power){
        result = result * number;
        counter++;
    }
     
    //Displaying the result 
    System.out.println(result);
    }
}
