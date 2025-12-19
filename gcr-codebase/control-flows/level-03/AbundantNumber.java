import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {

        //Take the input number from user 
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int sum = 0;
        
        //Calculate sum of all divisor of number
        for (int i = 1; i < number; i++) {
            if (number % i == 0)
                sum += i;
        }
       
       //if sum is grater then number then display result:
        if (sum > number){
            System.out.println("Abundant Number");
        }
        else{
            System.out.println("Not an Abundant Number");
        }
    }
}
