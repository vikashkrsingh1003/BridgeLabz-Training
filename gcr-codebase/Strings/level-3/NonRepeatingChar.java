import java.util.Scanner;

public class NonRepeatingChar {

    // Method to find the first non-repeating character
    public static char findFirstNonRepeatingChar(String text) {

        // Array to store frequency of each character (ASCII size = 256)
        int[] freq = new int[256];

        //count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        //find the first character with frequency 1
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (freq[ch] == 1) {
                return ch;
            }
        }

        //If no non-repeating character is found
        return '\0';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input String from user
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Call method and Display result
        char result = findFirstNonRepeatingChar(text);

        if (result != '\0') {
            System.out.println("First non repeating character is: " + result);
        } else {
            System.out.println("No non repeating character found.");
        }

        sc.close();
    }
}
