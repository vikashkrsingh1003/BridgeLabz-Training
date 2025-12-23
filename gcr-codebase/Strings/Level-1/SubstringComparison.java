import java.util.Scanner;

public class SubstringComparison {

    //Method to create substring using charAt()
    public static String substringUsingCharAt(String text, int startIndex, int endIndex) {
        String result = "";

        for (int i = startIndex; i < endIndex; i++) {
            result = result + text.charAt(i);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input text from user
        System.out.print("Enter the text: ");
        String inputText = sc.next();

        System.out.print("Enter start index: ");
        int startIndex = sc.nextInt();

        System.out.print("Enter end index: ");
        int endIndex = sc.nextInt();

        // Substring using charAt()
        String substringByCharAt = substringUsingCharAt(inputText, startIndex, endIndex);

        // Substring using built-in method
        String substringByBuiltIn = inputText.substring(startIndex, endIndex);

        // Displaying results
        System.out.println("\nSubstring using charAt(): " + substringByCharAt);
        System.out.println("Substring using substring(): " + substringByBuiltIn);

        sc.close();
    }
}