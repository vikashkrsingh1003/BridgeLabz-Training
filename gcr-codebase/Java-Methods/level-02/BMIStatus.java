import java.util.Scanner;

public class BMIStatus {

    //Method to calculate BMI for all persons
    public static void calculateBMI(double[][] data) {

        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightMeter = heightCm / 100;
            double bmi = weight / (heightMeter * heightMeter);
            data[i][2] = bmi;
        }
    }

    //Method to find BMI status
    public static String[] findBMIStatus(double[][] data) {

        String[] status = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi <= 18.4)
                status[i] = "Underweight";
            else if (bmi >= 18.5 && bmi <= 24.9)
                status[i] = "Normal";
            else if (bmi >= 25.0 && bmi <= 39.9)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] data = new double[10][3];

        // Take input for weight and height
        for (int i = 0; i < data.length; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();
        }

        //Calling calculateBMI method
        calculateBMI(data);

        //Calling findBMIStatus method 
        String[] status = findBMIStatus(data);

        for (int i = 0; i < data.length; i++) {
             System.out.println("Person " + (i + 1));
             System.out.println("Weight : " + data[i][0] + " kg");
             System.out.println("Height : " + data[i][1] + " cm");
             System.out.println("BMI    : " + data[i][2]);
             System.out.println("Status : " + status[i]);
             System.out.println();
        }

        sc.close();
    }
}
