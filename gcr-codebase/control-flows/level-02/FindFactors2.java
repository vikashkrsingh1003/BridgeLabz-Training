import java.util.*;

public class FindFactors2 {
    public static void main(String args[]){

    //Take the input number from the user
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();

    //Check and find factors using while loop
    if(number > 0){
        int counter = 1;
        while(counter < number){
            if(number % counter == 0){
                System.out.println(counter); //Displaying Results 
            }
            counter++;
        }
      }
    }
}
