import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {

        //Take the input  distance in feet from user
        Scanner sc = new Scanner(System.in);
        double distanceInFeet = sc.nextDouble();

        //Calculate the distance in yards and miles
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;

        // Print the distance in yards and miles
        System.out.println("The distance in yards is " + distanceInYards +
            " while the distance in miles is " + distanceInMiles);
    }
}
