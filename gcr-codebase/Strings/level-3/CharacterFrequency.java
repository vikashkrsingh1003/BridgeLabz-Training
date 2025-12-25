import java.util.Scanner;

public class CharacterFrequency {

    // Method to find frequency of characters
    // Returns a 2D array containing character and its frequency
    public static String[][] findCharacterFrequency(String text) {

        //ASCII = 256
        int[] freq = new int[256];

        //count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        //Count number of unique characters
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] != 0) {
                count++;
                freq[text.charAt(i)] = -1; 
            }
        }

        // Reset frequency array
        freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        // Create 2D array to store character and frequency
        String[][] result = new String[count][2];

        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (freq[ch] != 0) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(freq[ch]);
                index++;

                freq[ch] = 0; 
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Call method to get frequency
        String[][] frequency = findCharacterFrequency(text);

        // Display the result
        System.out.println("Character\tFrequency");
        System.out.println("---------------------");
        for (int i = 0; i < frequency.length; i++) {
            System.out.println(frequency[i][0] + "\t\t" + frequency[i][1]);
        }

        sc.close();
    }
}
