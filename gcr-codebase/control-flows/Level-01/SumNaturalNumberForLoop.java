import java.util.Scanner;
public class SumNaturalNumberForLoop {
    public static void main(String args[]){

      //Take the input number from user and intialize sum
      Scanner sc = new Scanner(System.in);
      int number = sc.nextInt();

      int sumOfLoop=0;
      int sumOfFormula=0;
      
      //compute the sum of natural number  using While loop 
      for(int i=1; i<= number; i++){
        sumOfLoop += i;
      }
      
      //compute the sum of natural number  using formula
      if(number > 0){
          sumOfFormula = number*(number+1)/2;
      }
      
      // Compare the both result are same or not and display result 
      if(sumOfLoop == sumOfFormula){
        System.out.println("Both Result are same :"+sumOfLoop+ " == "+ sumOfFormula);
      }

    }
}