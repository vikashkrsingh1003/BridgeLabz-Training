import java.util.Scanner;

public class RemoveDuplicates {

    // Method to remove duplicate characters
    public static void removeDuplicates(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Add character only if it is not already present
            if (!result.contains(String.valueOf(ch))) {
                result = result + ch;
            }
        }

        System.out.println("String after removing duplicates: " + result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        //Call method
        removeDuplicates(str);

        sc.close();
    }
}
