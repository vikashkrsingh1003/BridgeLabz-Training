import java.util.*;
public class CountVowelandConsonent {

    //Method to check Vowel, Consonant or Not a Letter
    public static String checkCharacter(char ch)
    {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
        }
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    //Method to find vowels and consonants 
    public static int[] findVowelsAndConsonants(String text)
    {
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            String result = checkCharacter(ch);

            if (result.equals("Vowel")) {
                vowels++;
            } else if (result.equals("Consonant")) {
                consonants++;
            }
        }
        return new int[]{vowels, consonants};
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Take user String input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int[] count = findVowelsAndConsonants(input);

        // Display result
        System.out.println("Number of Vowels: " + count[0]);
        System.out.println("Number of Consonants: " + count[1]);

        sc.close();
    }
}