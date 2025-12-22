import java.util.Scanner;

public class UnitConverterOfTemperature {

    //Method to convert Fahrenheit to Celsius
    public static double convertFarhenheitToCelsius(double farhenheit) {
          double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
          return farhenheit2celsius;
    }
    
    //Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFarhenheit(double celsius) {
          double celsius2farhenheit = (celsius * 9 / 5) + 32;
          return celsius2farhenheit;
    }

   //Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
          double pounds2kilograms = 0.453592;
          return pounds * pounds2kilograms;
    }
    
    //Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
          double kilograms2pounds = 2.20462;
          return kilograms * kilograms2pounds;
    }

    //Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
          double gallons2liters = 3.78541;
          return gallons * gallons2liters;
    }
    
    //Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
          double liters2gallons = 0.264172;
          return liters * liters2gallons;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      //Taking input from user
        System.out.println("Enter Fahrenheit to convert into Celsius: ");
        double farhenheit = sc.nextDouble();
        System.out.println("Enter Celsius to convert into Fahrenheit: ");
        double celsius = sc.nextDouble();
        System.out.println("Enter pounds to convert into kilograms: ");
        double pounds = sc.nextDouble();
        System.out.println("Enter kilograms to convert into pounds: ");
        double kilograms = sc.nextDouble();
        System.out.println("Enter gallons to convert into liters: ");
        double gallons = sc.nextDouble();
        System.out.println("Enter liters to convert into gallons: ");
        double liters = sc.nextDouble();


        //Called the function and displaying the results
        System.out.println("Fahrenheit to Celsius: " + convertFarhenheitToCelsius(farhenheit));
        System.out.println("Celsius to Fahrenheit: " + convertCelsiusToFarhenheit(celsius));
        System.out.println("Pounds to Kilograms: " + convertPoundsToKilograms(pounds));
        System.out.println("Kilograms to Pounds: " + convertKilogramsToPounds(kilograms));
        System.out.println("Gallons to Liters: " + convertGallonsToLiters(gallons));
        System.out.println("Liters to Gallons: " + convertLitersToGallons(liters));
         
        sc.close();
    }
}
