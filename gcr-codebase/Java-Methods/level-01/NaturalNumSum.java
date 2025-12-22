import java.util.*;
public class NaturalNumSum {
    
    //create the method for check number its positive.nagetive and zero 
     public static int calculateNaturalNumSum (int number){

       int sum=0;
      for(int i=1; i<= number; i++){
        sum += i;
        }
        return sum;
     }

       public static void main(String[] args) {
        
        //Taking an input number from user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int number = sc.nextInt();

        // Calling  method and displaying results 
        int result = calculateNaturalNumSum(number);
        System.out.println("the sum of natural num is  :  " + result);

        sc.close();
    }

}