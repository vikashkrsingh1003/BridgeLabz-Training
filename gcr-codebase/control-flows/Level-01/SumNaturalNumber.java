import java.util.Scanner;
public class SumNaturalNumber {
    public static void main(String args[]){

        //Take the input number from user and intialize sum
      Scanner sc = new Scanner(System.in);
      int number = sc.nextInt();

      int sumOfLoop=0;
      int sumOfFormula=0;
      int i=1;

      while(i <= number){
        sumOfLoop += i;
        i++;
      }

      if(number > 0){
          sumOfFormula = number*(number+1)/2;
      }
      
      if(sumOfLoop == sumOfFormula){
        System.out.println("Both Result are same :"+sumOfLoop+ " == "+ sumOfFormula);
      }

    }
}