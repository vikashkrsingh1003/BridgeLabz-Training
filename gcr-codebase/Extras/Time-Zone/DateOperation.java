import java.time.LocalDate;
import java.util.Scanner;

public class DateOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input date in ISO format
        System.out.print("Enter a date (YYYY-MM-DD): ");
        String inputDate = sc.nextLine();

        // Parse the input date
        LocalDate date = LocalDate.parse(inputDate);

        // Perform date arithmetic
        LocalDate result = date.plusDays(7).plusMonths(1).plusYears(2)
                           .minusWeeks(3);

        //Displaying the result
        System.out.println("Final date after calculations: " + result);

        sc.close();
    }
}
