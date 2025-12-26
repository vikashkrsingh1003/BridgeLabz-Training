import java.time.LocalDate;
import java.util.Scanner;

 class DateComparison {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Take input first date from user
        System.out.print("Enter first date (YYYY-MM-DD): ");
        LocalDate date1 = LocalDate.parse(scanner.nextLine());

        //Take input second date from user
        System.out.print("Enter second date (YYYY-MM-DD): ");
        LocalDate date2 = LocalDate.parse(scanner.nextLine());

        //Compare both dates and displaying result
        if (date1.isBefore(date2)) {
            System.out.println("The first date is BEFORE the second date.");
        } else if (date1.isAfter(date2)) {
            System.out.println("The first date is AFTER the second date.");
        } else if (date1.isEqual(date2)) {
            System.out.println("Both dates are the SAME.");
        }

        scanner.close();
    }
}
