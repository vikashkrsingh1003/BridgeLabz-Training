import java.util.Scanner;

public class AnagramCheck {

    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        // Step 1: Check if lengths are equal
        if (text1.length() != text2.length()) {
            return false;
        }

        // Step 2: Create frequency arrays for ASCII characters
        int[] freq1 = new int[256];
        int[] freq2 = new int[256];

        // Step 3: Count frequency of each character in both texts
        for (int i = 0; i < text1.length(); i++) {
            freq1[text1.charAt(i)]++;
            freq2[text2.charAt(i)]++;
        }

        // Step 4: Compare frequency arrays
        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }

        return true; // All frequencies match, so anagrams
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter first text: ");
        String text1 = sc.nextLine();

        System.out.print("Enter second text: ");
        String text2 = sc.nextLine();

        // Call method to check anagrams
        boolean result = areAnagrams(text1, text2);

        // Display result
        if (result) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are not anagrams.");
        }

        sc.close();
    }
}
