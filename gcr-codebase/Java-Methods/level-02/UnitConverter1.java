import java.util.Scanner;

public class UnitConverter1 {

    //Method to convert yards to feet 
    public static double convertYardsToFeet(double yards) {
          double yards2feet = 3;
          return yards * yards2feet;
    }
    
    //Method to convert feet to yards
    public static double converFeetToYards(double feet){
         double feet2yards = 0.333333;
          return feet * feet2yards;
    }

    //Method to convert meters to inches
    public static double converMeterToInches(double meter){
          double meters2inches = 39.3701;
          return meter * meters2inches;
    }
    
    //Method to convert inches to meters
    public static double convertInchesToMeters(double inchesToMeters){
          double inches2meters = 0.0254;
          return inchesToMeters * inches2meters;
    }

    //Method to convert inches to centimeters
    public static double convertInchesToCentimeters(double inchesToCm){
          double inches2cm = 2.54;
          return inchesToCm * inches2cm;
    }

    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

         //Take a input yards , feet, meter. inch from user 
         System.out.println("Enter yards to convert into feet: ");
         double yards = sc.nextInt();
         System.out.println("Enter feet to convert into yards: ");
         double feet = sc.nextInt();
         System.out.println("Enter meters to convert into inches: ");
         double meters = sc.nextInt();
         System.out.println("Enter inches to convert into meters: ");
         double inchesToMeters = sc.nextInt();
         System.out.println("Enter inches to convert into centimeters: ");
         double inchesToCm = sc.nextInt();

         System.out.println("Yards in feet is: " + convertYardsToFeet(yards));
         System.out.println("Feet to yards is: " + converFeetToYards(feet));
         System.out.println("Meters to inches is: " + converMeterToInches(meters));
         System.out.println("Inches to meters is: " + convertInchesToMeters(inchesToMeters));
         System.out.println("Inches to centimeters is: " +  convertInchesToCentimeters(inchesToCm));
         
         sc.close();
    }
}
