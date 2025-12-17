import java.util.Scanner;

public class DoubleOpration {
    public static void main(String[] args) {

        //Take the input double values a, b, and c from user
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        //Perform double operations using operator precedence
        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;

        // Print the results of double operations
        System.out.println("The results of Double Operations are " +
            result1 + ", " + result2 + ", " + result3 + ", and " + result4 );
    }
}
