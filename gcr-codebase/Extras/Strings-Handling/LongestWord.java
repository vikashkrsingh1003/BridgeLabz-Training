import java.util.Scanner;

public class LongestWord {

    public static void findLongestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longest = "";

        // Find the longest word
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        System.out.println("Longest word: " + longest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Take a input sentence from user
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        findLongestWord(sentence);
        sc.close();
    }
}
