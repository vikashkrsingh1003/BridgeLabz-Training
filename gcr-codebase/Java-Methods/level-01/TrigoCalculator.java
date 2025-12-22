import java.util.*;
public class TrigoCalculator {

    public static double[] calculateTrigonometricFunctions(double angle) {
        //Convert degrees to radians
        double radians = Math.toRadians(angle);

        //Calculate trigonometric values and store the value in array
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        return new double[] { sine, cosine, tangent };
    }

    public static void main(String[] args) {
        
        //take the input angle from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();

         //Calling the method and Displaying results
        double[] result = calculateTrigonometricFunctions(angle);
        System.out.println("Sine: " + result[0]);
        System.out.println("Cosine: " + result[1]);
        System.out.println("Tangent: " + result[2]);

        sc.close();
    }
}
