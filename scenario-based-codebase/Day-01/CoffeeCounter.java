import java.util.*;

public class CoffeeCounter{

        //Method to calculates total bill of coffee
        public static double calculatesBill(String str, int quantity){
     
                  double bill = 0, tempBill = 0;
                  double gst =  0.05;
 
                  switch(str)
                  {
                    case "Espresso":
                               tempBill = quantity * 120 * gst;
                               bill = quantity * 120 + tempBill;
                               break;
                    case "Cappuccino":
                               tempBill = quantity * 150 * gst;
                               bill = quantity * 150 + tempBill;
                               break;
                    case "Latte":
                               tempBill = quantity * 160 * gst;
                               bill = quantity * 160 + tempBill;
                               break;
                    case "Americano":
                               tempBill = quantity * 140 * gst;
                               bill = quantity * 140 + tempBill;
                               break;
                    case "Mocha":
                               tempBill = quantity * 170 * gst;
                               bill = quantity * 170 + tempBill;
                               break;
                    default:
                              System.out.println("Coffee not available");
                  }
                  return bill;
                         
         }
          
         public static void main(String[] args){
                    
                  Scanner sc = new Scanner(System.in);
                    
                  System.out.println("No.\tName\tPrice");
                  System.out.println("----------------------");
                  System.out.println( "1\tEspresso\t120\n" + "2\tCappuccino\t150\n" + "3\tLatte\t\t160\n" + "4\tAmericano\t140\n" +"5\tMocha\t\t170");
                 
                  do{
                        System.out.println("Enter type of coffee you want: ");
                        String  str = sc.nextLine();
                        if(str.equals("exit"))
                              break;
                        System.out.println("Enter quantity of coffee: ");
                        int quantity = sc.nextInt();
                        sc.nextLine();

                        double bill = CoffeeCounter.calculatesBill(str, quantity);
                        System.out.println("Your total bill is: " + bill);
                  }while(true);
                    
                  sc.close();
          }
} 