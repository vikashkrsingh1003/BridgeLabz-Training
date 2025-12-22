import java.util.*;
public class SimpleIntrest {
    
    //create the method 
     public static double  calculateSimpleInterest(double principle,double time,double rate){

        double intrest = (principle*time*rate)/100;

         return intrest;
     }

       public static void main(String[] args) {
        
        //Taking an input principle, rate and time from user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the principle: ");
        double principle = sc.nextDouble();

        System.out.println("Enter the Time: ");
        double time = sc.nextDouble();

        System.out.println("Enter the rate: ");
        double rate = sc.nextDouble();
        
        // Calling  method and displaying results 
        double result = calculateSimpleInterest(principle , time, rate);
        System.out.println("Simple Interest is: " + result);

        sc.close();
    }

}