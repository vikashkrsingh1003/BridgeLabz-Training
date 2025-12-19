import java.util.Scanner;
public class Factorial2 {
   public static void main(String args[]){

    //Take the input number from user
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
  
    int factorial = 1;
    
    //calculate the factorial using for loop
    for(int i=number ; i >0; i--){
        factorial *= i;
    } 

     //Displaying the result 
     System.out.println("Factorial is : " + factorial);

     sc.close();


   }

}