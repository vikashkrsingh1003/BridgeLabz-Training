import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {

        //Take the input values of a, b, and c from user
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Perform integer operations using operator precedence
        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        int result4 = a % b + c;

        // Print the results of integer operations in one line
        System.out.println("The results of Int Operations are " +
            result1 + ", " + result2 + ", " + result3 + ", and " + result4
        );
    }
}
