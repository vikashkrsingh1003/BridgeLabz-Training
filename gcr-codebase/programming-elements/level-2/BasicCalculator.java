import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

        // take input first number and second number from user 
        Scanner sc = new Scanner(System.in);
        double number1 = sc.nextDouble();
        double number2 = sc.nextDouble();

        // Perform arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        // Display the results in one line 
        System.out.println("The addition, subtraction, multiplication, and division value of "+ number1 + " and " + number2 + " is :"
            + addition + ", " + subtraction + ", " + multiplication + ", and " + division);

        // Close the scanner
        scanner.close();
    }
}
