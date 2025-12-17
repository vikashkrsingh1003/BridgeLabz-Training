import java.util.*;

public class KilometerToMiles{
    public static void main(String args[]){
   
   //Take the input in km from the user 
    Scanner sc = new Scanner(System.in);
    double km = sc.nextDouble();
   
   // Convert Kilometers to Miles 
    double miles = km * 0.6;

   //Displaying the kilometer and Miles in one Line
    System.out.println("The total miles is "+ miles +" mile for the given " + km +" km");

    }
}