import java.util.*;
 public class ParkingGame{

    public static void main(String args[]) {

       Scanner sc = new Scanner(System.in);
       int capacity = 5;
       int Occupancy =0;
       String choice;
       
       
       while(capacity >0){
       

        System.out.println("Enter your choice: (Park , Exit , Terminate ) " );
         choice = sc.next();

         if(!choice.equals("Park") && !choice.equals("Exit")){
          break;
          }
        
          switch(choice){
          case "Park":
            if (capacity > 0) {
                    System.out.println("Parked successfully");
                    capacity--;
                    Occupancy++;
                    } else {
                        System.out.println("Parking Full!");
                     }
                     break;
          
         case "Exit":
            if(Occupancy >0){
            System.out.println("Car Exit successfully");
            capacity++;
            Occupancy--;
          } else{
            System.out.println("Car not exists (please first parked your cark) ");
           }
        
            break;
          }

        System.out.println("Available parking slots are: " + capacity);
        System.out.println("Current occupancy is: " + Occupancy);

       }
       sc.close();
      }

    }
  