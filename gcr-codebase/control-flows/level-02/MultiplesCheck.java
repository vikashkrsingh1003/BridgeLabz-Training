import java.util.*;

public class MultiplesCheck {
    public static void main(String args[]){

    //Get the input from the user
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();

    //Print multiples below 100
    if(number > 0 && number < 100){
        for(int i = 100; i >= 1; i--){
            if(i % number == 0){
                System.out.println(i);
            }
        }
    }
    }
}
