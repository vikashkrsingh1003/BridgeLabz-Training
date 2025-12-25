import java.util.Scanner;

public class CharacterFrequency2 {

    // Method to find unique characters using nested loops and charAt()
    public static char[] findUniqueCharacters(String text) {

        int len = text.length();
        char[] temp = new char[len];
        int count = 0;

        // Outer loop to pick each character
        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            boolean isUnique = true;

             // Inner loop to check if character appeared before
            for (int j = 0; j < i; j++) {
                if (ch == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            // Store unique character
            if (isUnique) {
                temp[count] = ch;
                count++;
            }
        }

        //Create array with exact size
        char[] uniqueChars = new char[count];
        for (int i = 0; i < count; i++) {
            uniqueChars[i] = temp[i];
        }

        return uniqueChars;
    }

    // Method to find frequency using unique characters
    public static String[][] findCharacterFrequency(String text) {

        // ASCII frequency array
        int[] freq = new int[256];

        // Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        // Get unique characters
        char[] uniqueChars = findUniqueCharacters(text);

        // 2D array to store character and frequency
        String[][] result = new String[uniqueChars.length][2];

        // Store character and its frequency
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(freq[uniqueChars[i]]);
        }

        return result;
    }

    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Call method to find frequency
        String[][] frequency = findCharacterFrequency(text);

        // Display result
        System.out.println("Character\tFrequency");
        for (int i = 0; i < frequency.length; i++) {
            System.out.println(frequency[i][0] + "\t\t" + frequency[i][1]);
        }

        sc.close();
    }
}
