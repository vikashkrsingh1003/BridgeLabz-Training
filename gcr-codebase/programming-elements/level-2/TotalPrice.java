import java.util.Scanner;

public class TotalPrice {
    public static void main(String[] args) {

        //Take the input unit price and quantity from user
        Scanner sc = new Scanner(System.in);
        double unitPrice = sc.nextDouble();
        int quantity = sc.nextInt();

        // Calculate the total purchase price
        double totalPrice = unitPrice * quantity;

        // Print the total purchase price
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity +
                            " and unit price is INR " + unitPrice);
    }
}
