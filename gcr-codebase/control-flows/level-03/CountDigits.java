import java.util.*;

public class CountDigits{
    public static void main(String args[]){

    //Take the input number from the user
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();

    int count = 0;

    //Count digits using loop
    while(number != 0){
        number = number / 10;
        count++;
    }
   // Displaying the result
    System.out.println("The count is : "+count);
    }
}
