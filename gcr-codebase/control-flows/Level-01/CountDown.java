import java.util.*;
public class CountDown {
    public static void main(String args[]){

        //Take input counter from user
        Scanner sc = new Scanner(System.in);
        int counter = sc.nextInt();

        //Countdown using while loop
          while (counter >= 1) {
            System.out.println("Countdown: "+ counter);
            counter--; 
        }

        sc.close();


    }
}