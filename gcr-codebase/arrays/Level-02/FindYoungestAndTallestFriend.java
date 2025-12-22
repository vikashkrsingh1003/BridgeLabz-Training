// Creating a class named FindYoungestAndTallestFriend and purpose to find the youngest and tallest friend.
import java.util.Scanner;

class YoungestAndTallestFriend {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Arrays to store ages and heights
        int[] age = new int[3];
        double[] height = new double[3];

        // create array to store names
        String[] names = {"Amar", "Akbar", "Anthony"};

        // Taking input from user
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for " + names[i]);
            System.out.print("Enter age: ");
            age[i] = sc.nextInt();
            System.out.print("Enter height (in cm): ");
            height[i] = sc.nextDouble();
        }

        // Calculating the result using for loop
        int youngest = 0;
        int tallest = 0;
        for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngest]) {
                youngest = i;
            }
            if (height[i] > height[tallest]) {
                tallest = i;
            }
        }

        // Displaying results
        System.out.println("Youngest Friend is: " + names[youngest] + " Age is: " + age[youngest]);
        System.out.println("Tallest Friend is: " + names[tallest] + " Height is: " + height[tallest]);

        sc.close();
    }
}
