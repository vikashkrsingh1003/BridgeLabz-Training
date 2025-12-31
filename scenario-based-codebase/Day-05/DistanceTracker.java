/*19. Bus Route Distance Tracker 🚌
Each stop adds distance.
● Ask if the passenger wants to get off at a stop.
● Use a while-loop with a total distance tracker.
● Exit on user confirmation.*/

import java.util.*;
public class DistanceTracker {
    public static void main(String[] args) {
        
   Scanner scanner = new Scanner(System.in);

        int stopNumber = 1;
        double totalDistance = 0.0;
        double distancePerStop = 5; // distance added at each stop (km)

        String getOff = "no";

        while (true) {

            System.out.println("Stop " + stopNumber + " reached.");
           totalDistance += distancePerStop;
          System.out.println("Total distance: " + totalDistance + " km");
    
           System.out.print("Get off? (yes/no): ");
           String answer = scanner.nextLine();

            if (answer.equalsIgnoreCase("yes")) {
                 break;
                }

            stopNumber++;
            System.out.println();
           }

        System.out.println("You got off the bus.");
        System.out.println("Total distance traveled: " + totalDistance + " km");  

        } 
}