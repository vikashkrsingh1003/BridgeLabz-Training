import java.util.Scanner;

public class OutOfBoundsException{

    // Method to generate StringIndexOutOfBoundsException
    public static void generateException(String text) {

        // Accessing index beyond string length
        System.out.println(text.charAt(text.length()));
    }

    // Method to handle StringIndexOutOfBoundsException
    public static void handleException(String text) {

        try {
            // Risky code
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException exception) {
            System.out.println("StringIndexOutOfBoundsException caught!");
            System.out.println("Reason: Index accessed is outside the string length.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Taking  input text from user
        System.out.print("Enter a string: ");
        String inputText = sc.next();

        //Calling method that generates exception
        System.out.println("\nGenerating StringIndexOutOfBoundsException:");
        generateException(inputText);

        //Calling method that handles exception
        System.out.println("\nHandling StringIndexOutOfBoundsException:");
        handleException(inputText);

        sc.close();
    }
}
