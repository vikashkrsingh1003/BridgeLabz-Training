import java.util.*;

public class FindFactors {
    public static void main(String args[]){

    //Take  the input number from the user
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();

    //Check and find factors using for loop
    if(number > 0){
        for(int i = 1; i < number; i++){
            if(number % i == 0){
                System.out.println(i);
            }
        }
      }
    }
}
