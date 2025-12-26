import java.util.*;

public class CalculateBMI{

        //Method to calculates BMI of person
        public static double calculatesBMIofPerson(double weight, double height){
      
                  double bmi = weight / (height * height);
                  return bmi;        
         }
          
         public static void main(String[] args){
                    
                  Scanner sc = new Scanner(System.in);
                                  
                  System.out.println("Enter your height in meters: ");
                  double  height = sc.nextDouble();
                  System.out.println("Enter your weight in kg: ");
                  double weight = sc.nextDouble();

                  double bmi = CalculateBMI.calculatesBMIofPerson(weight, height);

                  if (bmi < 18.5){
                      System.out.println("Your BMI Category is: Underweight");
                  }else if (bmi >= 18.5 && bmi < 25) {
                      System.out.println("Your BMI Category is: Normal");
                  } else {
                      System.out.println("Your BMI Category is: Overweight");
                  }
          
                  sc.close();
          }
} 