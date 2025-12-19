import java.util.*;

public class MultiplesCheck2 {
    public static void main(String args[]){

    //Get the input from the user
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();

    //Find multiples using while loop
    if(number > 0 && number < 100){
        int counter = 100;
        while(counter > 1){
            if(counter % number == 0){
                System.out.println(counter);
            }
            counter--;
        }
      }
    }
}
