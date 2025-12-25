import java.util.Scanner;

public class CharacterFrequency3 {

    //Method to find character frequencies using nested loops
    public static String[] findCharacterFrequency(String text) {

        char[] chars = text.toCharArray();
        int len = chars.length;
        int[] freq = new int[len];      

        // count frequency of each character
        for (int i = 0; i < len; i++) {
            if (chars[i] == '0') continue; 
            freq[i] = 1;                  

            // Inner loop to check duplicates
            for (int j = i + 1; j < len; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0';       
                }
            }
        }

        //Count how many unique characters (frequency > 0)
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (chars[i] != '0') count++;
        }

        // Create String array to store character and frequency
        String[] result = new String[count];

        int index = 0;
        for (int i = 0; i < len; i++) {
            if (chars[i] != '0') {
                result[index] = chars[i] + " = " + freq[i];
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Call method to find frequency
        String[] frequency = findCharacterFrequency(text);

        // Display result
        System.out.println("Character Frequencies:");
        for (String s : frequency) {
            System.out.println(s);
        }

        sc.close();
    }
}
