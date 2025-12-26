import java.util.Scanner;

public class MostFrequentCharacter {

    // Method to find most frequent character
    static void findMostFrequentChar(String str) {
        int maxCount = 0;
        char mostFrequent = str.charAt(0);

        // Compare each character with others
        for (int i = 0; i < str.length(); i++) {
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                mostFrequent = str.charAt(i);
            }
        }

        System.out.println("Most Frequent Character: '" + mostFrequent + "'");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        findMostFrequentChar(str);
        sc.close();
    }
}
