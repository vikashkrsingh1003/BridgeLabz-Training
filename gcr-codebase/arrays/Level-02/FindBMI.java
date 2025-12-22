//creating a class named FindBMI purpose to calculate BMI and weight status.
import java.util.Scanner;

class FindBMI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Take input for number of persons
        int n = sc.nextInt();

        //create arrays to store each person details
        double[] weight = new double[n];
        double[] height = new double[n];  
        double[] bmi = new double[n];
        String[] status = new String[n];

        //Take input for weight and height using for-loop
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));
            System.out.print("Enter weight (in kg): ");
            weight[i] = sc.nextDouble();
            System.out.print("Enter height (in cm): ");
            height[i] = sc.nextDouble();
            height[i] = height[i] / 100;
        }

        //calculate BMI and determine weight status
        for (int i = 0; i < n; i++) {
            bmi[i] = weight[i] / (height[i] * height[i]);
            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            } 
            else if (bmi[i] >= 18.5 && bmi[i] <= 24.9) {
                status[i] = "Normal";
            } 
            else if (bmi[i] >= 25.0 && bmi[i] <= 39.9) {
                status[i] = "Overweight";
            } 
            else {
                status[i] = "Obese";
            }
        }

        //print height, weight, BMI, and status
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1));
            System.out.println("Height is: " + height[i]);
            System.out.println("Weight is: " + weight[i]);
            System.out.println("BMI: is " + bmi[i]);
            System.out.println("Status: " + status[i]);
            System.out.println();
        }

        sc.close();
    }
}