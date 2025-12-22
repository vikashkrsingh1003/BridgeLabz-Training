import java.util.Scanner;

public class ChoclateDivide {

    // Method to how many chocolate gets child and remaining
    public static int[] findRemainderAndQuotients (int numberOfchocolates, int numberOfChildren) {
        int childgetsChoclate = numberOfchocolates / numberOfChildren;
        int remaining  = numberOfchocolates % numberOfChildren;

        return new int[]{childgetsChoclate, remaining};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input numberOfChildren and numberOfchocolates
        System.out.print("Enter the numberOfChildren: ");
        int numberOfChildren = sc.nextInt();

        System.out.print("Enter the numberOfchocolates : ");
        int numberOfchocolates  = sc.nextInt();

        //Calling the method and Displaying results
        int[] result = findRemainderAndQuotients(numberOfchocolates, numberOfChildren);
        System.out.println("Quotient: " + result[0]);
        System.out.println("Remainder: " + result[1]);

        sc.close();
    }
}
