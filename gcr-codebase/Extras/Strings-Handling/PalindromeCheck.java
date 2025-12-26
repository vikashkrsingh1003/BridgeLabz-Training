import java.util.Scanner;

public class PalindromeCheck {

   public static void checkPalindrome(String str) {
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        //Compare original and reversed string
        if (str.equals(rev)) {
            System.out.println("Palindrome String");
        } else {
            System.out.println("Not a Palindrome String");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        checkPalindrome(str);
        sc.close();
    }
}
