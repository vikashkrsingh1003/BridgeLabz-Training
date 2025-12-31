import java.util.Scanner;

public class DiwaliLuckyDraw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=======================================");
        System.out.println("   WELCOME TO DIWALI MELA  ");
        System.out.println("     FESTIVAL LUCKY DRAW ");
        System.out.println("=======================================\n");

        System.out.print("Enter number of visitors: ");
        int visitors = sc.nextInt();

        for (int i = 1; i <= visitors; i++) {
            System.out.println("\n---------------------------------------");
            System.out.print("Visitor " + i + ", enter your number: ");

            int number = sc.nextInt();

            // Invalid input
            if (number <= 0) {
                System.out.println("Invalid Number!");
                System.out.println(" Visitor skipped.");
                continue;
            }

            // Lucky draw check
            if (number % 3 == 0 && number % 5 == 0) {
                 System.out.println("-----------------------------------");
                System.out.println(" CONGRATULATIONS ");
                System.out.println("You WON a special Diwali Gift! ");
                 System.out.println("------------------------------------");
            } else {
                System.out.println("------------------------------------");
                System.out.println(" Sorry!");
                System.out.println(" Better luck next time!");
                 System.out.println("------------------------------------");
            }
        }

        System.out.println("\n=======================================");
        System.out.println("THANK YOU FOR VISITING DIWALI MELA ");
        System.out.println("=======================================");

        sc.close();
    }
}
