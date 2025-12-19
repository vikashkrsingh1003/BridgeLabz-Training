import java.util.Scanner;
public class Factorial{
   public static void main(String args[]){

      //Take the input number from user
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
  
    int factorial =1;
    
    //calculate the factorial using while loop
    while(number >0){
        factorial *=number;
        number--;
    }

  //Displaying the result 

    System.out.println("Factorial is : "+ factorial);


   }

}