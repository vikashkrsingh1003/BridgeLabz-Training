import java.util.Scanner;

public class RemoveSpecificCharacter {

    // Method to remove given character
    static void removeCharacter(String str, char ch) {
        String result = "";

        // Build new string without the given character
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch) {
                result = result + str.charAt(i);
            }
        }

        System.out.println("Modified String: \"" + result + "\"");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Take a input string from user
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter character to remove: ");
        char ch = sc.next().charAt(0);

        removeCharacter(str, ch);
        sc.close();
    }
}
