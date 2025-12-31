// Digital Watch Simulation ⏱️
// Simulate a 24-hour watch:
// ● Print hours and minutes in a nested for-loop.
// ● Use a break to stop at 13:00 manually (simulate power cut).
// Core Java Scenario Based Problem Statements

import java.util.*;
public class WatchSimulation {
     public static void main(String[] args) {
     
    // Decorative heading
        System.out.println("======================================");
        System.out.println("       DIGITAL WATCH SIMULATION        ");
        System.out.println("======================================");

    int hour = 24;
    int minutes = 60;
    // Loop for hours (0 to 23)
    for(int i=0;i < hour; i++){
        // Loop for minutes (0 to 59)
        for(int j=0; j<minutes;j++){
            
            System.out.println( i +":"+ j);
            if(i==13 && j==0){
               System.out.println("--------------------------------------");
                    System.out.println(" POWER CUT OCCURRED!");
                    System.out.println(" Watch stopped working at 13:00 ");
                    System.out.println("--------------------------------------");
                    break;
            }
            
        }
    }
  }
}