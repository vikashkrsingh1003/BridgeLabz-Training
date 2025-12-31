import java.util.*;

public class TemperatureRecord {
    public static void main(String[] args) {
      
      //create an object and initialize day and one temprature array 
      Scanner sc = new Scanner(System.in);
      int days = 7;
      double temprature[] = new double[days];
  
      //take a two variable double sum and max 
      double sum =0;
      double max ;

      //Take input day by day temprature from user and calculate total sum;
      for(int i=0; i<days ; i++){
        
         System.out.println("Enter temprature for the day "+ (i+1) + ": ");
         temprature[i] = sc.nextDouble();
         System.out.println("-------------------------------------------");
         sum += temprature[i];

      }

      //Assume first day temp is maximum
      max = temprature[0];

      //now find the maximum temp for all seven day
      for(int i=0; i<days;i++){

         if(temprature[i] > max){
             max = temprature[i];
         }
      }

      //calculate the avg of temprature and Displaying results
       double average = sum/days;
      System.out.println("-------------------------------------------");
      System.out.println("\n The average temprature is : " + average);
      System.out.println(" The Maximum temprature is : " + max);
      System.out.println("-------------------------------------------");
    }
}