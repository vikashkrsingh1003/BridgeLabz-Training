import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {

        //Take the input weight and height in cm
        Scanner sc = new Scanner(System.in);
        double weight = sc.nextDouble();
        double heightCm = sc.nextDouble();

        // Convert height from cm to meters and calculate bmi
        double heightM = heightCm / 100;
        double bmi = weight / (heightM * heightM);

        //check the condition and display the result
        if (bmi < 18.5){
            System.out.println("Under weight");
        }
        else if (bmi < 24.9){
            System.out.println("Normal weight");
        }
        else if (bmi < 29.9){
            System.out.println("Over weight");
        }
        else{
            System.out.println("Obese");
        }
    }
}
