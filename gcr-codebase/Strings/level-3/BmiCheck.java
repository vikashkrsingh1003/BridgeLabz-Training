import java.util.Scanner;

public class BmiCheck {

    // Method to calculate BMI and status for one person
    // It takes weight (kg) and height (cm) as input
    // It returns a String array containing BMI value and status
    public static String[] calculateBMI(double weight, double heightCm) {

        // Convert height from cm to meters
        double heightMeter = heightCm / 100;

        // Calculate BMI using the formula
        double bmi = weight / (heightMeter * heightMeter);

        // Decide BMI status
        String status;
        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi < 25) {
            status = "Normal";
        } else if (bmi < 30) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // Return BMI (formatted to 2 decimals) and status
        return new String[] { String.format("%.2f", bmi), status };
    }

    // Method that takes 2D array of height and weight
    // Calls calculateBMI method and stores results in a 2D String array
    public static String[][] processBMI(double[][] data) {

        // Create a 2D String array to store height, weight, BMI, and status
        String[][] result = new String[10][4];

        for (int i = 0; i < 10; i++) {

            double weight = data[i][0];
            double height = data[i][1];

            // Call BMI calculation method
            String[] bmiData = calculateBMI(weight, height);

            // Store values in String array
            result[i][0] = String.valueOf(height);
            result[i][1] = String.valueOf(weight);
            result[i][2] = bmiData[0];
            result[i][3] = bmiData[1];
        }

        return result;
    }

    // Method to display the result in tabular format
    public static void displayResult(String[][] result) {

        System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\t\tStatus");
        System.out.println("----------------------------------------------------------");

        for (int i = 0; i < result.length; i++) {
            System.out.println(
                    result[i][0] + "\t\t" +
                    result[i][1] + "\t\t" +
                    result[i][2] + "\t\t" +
                    result[i][3]
            );
        }
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 2D array to store weight and height
        // First column = weight, Second column = height
        double[][] data = new double[10][2];

        // Taking input from user
        for (int i = 0; i < 10; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));

            System.out.print("Enter weight (in kg): ");
            data[i][0] = sc.nextDouble();

            System.out.print("Enter height (in cm): ");
            data[i][1] = sc.nextDouble();
        }

        // Process BMI data
        String[][] result = processBMI(data);

        // Display final output
        displayResult(result);

        sc.close();
    }
}
