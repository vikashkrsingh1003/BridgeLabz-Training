import java.util.Scanner;

public class MaximumOfThree {

    static int findMax(int a, int b, int c) {
        int max = a;

        if (b > max) max = b;
        if (c > max) max = c;

        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x = sc.nextInt();

        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        System.out.print("Enter third number: ");
        int z = sc.nextInt();

        int max = findMax(x, y, z);

        System.out.println("Maximum number is: " + max);

        sc.close();
    }
}
