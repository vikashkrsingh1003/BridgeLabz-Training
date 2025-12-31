// 18. Currency Exchange Kiosk 💱
// Design a currency converter:
// ● Take INR amount and target currency.
// ● Use a switch to apply the correct rate.
// ● Ask if the user wants another conversion (do-while).

import java.util.*;
public class ExchangeCurrency 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        char choice;

        do{
        System.out.println("Enter the amount in INR: ");
        double inr = sc.nextDouble();
         System.out.println("-------------------------------------");
         System.out.println("Choose target currency:");
         System.out.println("1. USD");
         System.out.println("2. EUR");
         System.out.println("3. GBP");
         System.out.println("4. JPY");
         System.out.println("--------------------------------------");
        System.out.print("Enter your choice (1-4): ");

            int currency = sc.nextInt();
            double convertedAmount = 0;
            System.out.println("==========================="); 
            switch (currency) {
                  
                case 1:
                    convertedAmount = inr * 0.011; //US Dollar
                    System.out.println("Amount in USD: " + convertedAmount);
                    break;

                case 2:
                    convertedAmount = inr * 0.0095; //Euro
                    System.out.println("Amount in EUR: " + convertedAmount);
                    break;

                case 3:
                    convertedAmount = inr * 0.0083; //British Pound Sterling
                    System.out.println("Amount in GBP: " + convertedAmount);
                    break;

                case 4:
                    convertedAmount = inr * 1.74; //Japanese Yen
                    System.out.println("Amount in JPY: " + convertedAmount);
                    break;
                  
                default:
                    System.out.println("Invalid currency choice!");
            }
            System.out.println("==============================="); 

            System.out.print("Do you want another conversion? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');
         
        System.out.println("--------------------------------------------------"); 
        System.out.println("Thank you for using the Currency Exchange Kiosk!");
        System.out.println("--------------------------------------------------"); 
        sc.close();
    }
}
       
    