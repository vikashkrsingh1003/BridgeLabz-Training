import java.util.*;

public class FitnessTracker {
    public static void main(String[] args) {

        //Push-ups done each day (0 means rest day)
        int[] pushUps = {30, 0, 25, 40, 0, 35, 20};

        int total = 0;
        int workoutDays = 0;

        for (int count : pushUps) {

            // Skip rest days
            if (count == 0) {
                continue;
            }
           //Calculate total push-up in week
            total += count;
            workoutDays++;
        }

        double average = (workoutDays > 0) 
                         ? (double) total / workoutDays 
                         : 0;
       
       //Displaying the result total and average 
        System.out.println("---------------------------------------------------");                 
        System.out.println("\t Total push-ups: " + total);
        System.out.println("\t Average push-ups per workout day: " + average);
         System.out.println("----------------------------------------------------");
    }
}

    
