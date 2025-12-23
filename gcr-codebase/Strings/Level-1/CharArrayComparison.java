import java.util.Scanner;

public class CharArrayComparison {

    // User-defined method to return characters of a string
    public static char[] getCharactersUsingMethod(String text) {

        char[] characters = new char[text.length()];

        for (int index = 0; index < text.length(); index++) {
            characters[index] = text.charAt(index);
        }

        return characters;
    }

    // Method to compare two character arrays
    public static boolean compareCharArrays(char[] firstArray, char[] secondArray) {

        if (firstArray.length != secondArray.length) {
            return false;
        }

        for (int index = 0; index < firstArray.length; index++) {
            if (firstArray[index] != secondArray[index]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input text from user
        System.out.print("Enter the text: ");
        String inputText = sc.next();

        //Using user-defined method
        char[] userDefinedArray = getCharactersUsingMethod(inputText);

        //Using built-in method
        char[] builtInArray = inputText.toCharArray();

        //Comparing both arrays
        boolean result = compareCharArrays(userDefinedArray, builtInArray);

        // Displaying characters
        System.out.print("\nCharacters using user-defined method: ");
        for (char ch : userDefinedArray) {
            System.out.print(ch + " ");
        }

        System.out.print("\nCharacters using toCharArray(): ");
        for (char ch : builtInArray) {
            System.out.print(ch + " ");
        }

        // Display result
        System.out.println("\nBoth char Array are ? " + result);

        sc.close();
    }
}
