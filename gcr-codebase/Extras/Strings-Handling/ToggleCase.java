import java.util.Scanner;

class ToggleCase {

    static void toggleCase(String str) {
        String result = "";

        // Toggle each character
        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                result += Character.toLowerCase(ch);
            } else if (Character.isLowerCase(ch)) {
                result += Character.toUpperCase(ch);
            } else {
                result += ch;
            }
        }

        System.out.println("Toggled string: " + result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        toggleCase(str);
        sc.close();
    }
}
