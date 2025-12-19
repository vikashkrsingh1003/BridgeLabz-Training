import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0.0;   
        double number = sc.nextDouble();
        
        // While user does not enter 0
        while (number > 0) {
            total += number;  
            
            //for nextInput 
            number = sc.nextDouble();
        }

        //Display the total
        System.out.println("Total sum = " + total);

       
    }
}