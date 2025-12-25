import java.util.Scanner;

public class UniqueCharacters {

    //Method to find length of the string without using length()
    public static int getLength(String text) {
        int count = 0;

        for (char c : text.toCharArray()) {
            count++;
        }

        return count;
    }

    // Method to find unique characters using charAt()
    public static char[] findUniqueCharacters(String text) {

        int len = getLength(text);
        char[] temp = new char[len];
        int index = 0;

        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (ch == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[index] = ch;
                index++;
            }
        }

        char[] result = new char[index];
        for (int i = 0; i < index; i++) {
            result[i] = temp[i];
        }

        return result;
    }

 
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        //Taking input string from user 
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        char[] uniqueChars = findUniqueCharacters(text);
         //Displaying the results 
        System.out.println("Unique characters are:");
        for (int i = 0; i < uniqueChars.length; i++) {
            System.out.print(uniqueChars[i] + " ");
        }

        sc.close();
    }
}
