import java.util.Scanner;

public class SubstringCount {

    public static void countSubstring(String str, String sub) {
        int count = 0;
        int index = 0;

        // Count occurrences of substring
        while ((index = str.indexOf(sub, index)) != -1) {
            count++;
            index = index + sub.length();
        }

        System.out.println("Substring found " + count + " times");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        //Take input from user
        System.out.print("Enter main string: ");
        String str = sc.nextLine();

        System.out.print("Enter substring: ");
        String sub = sc.nextLine();

        countSubstring(str, sub);
        sc.close();
    }
}
