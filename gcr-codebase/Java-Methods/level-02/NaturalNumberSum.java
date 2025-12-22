import java.util.Scanner;

public class NaturalNumberSum {

    //Method to find sum of natural number using recursion
    public static int FindSumUsingRecursion(int number) {
      if(number > 0){
         if(number == 0)
            return number;
         else
            return number+FindSumUsingRecursion(number - 1);
      }
        return 0;
     }

    //Method to find sum of natural number using formulae
    public static int FindSumUsingFormulae(int number) {
       return number * (number + 1)/2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take a number as input from user 
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int sum1 = FindSumUsingRecursion(number);
        int sum2 = FindSumUsingFormulae(number);
        if(sum1 == sum2)
        {
         System.out.println("Sum using recursion is : " + sum1);
         System.out.println("Sum using formula : " + sum2);
        }

        sc.close();
    }
}
