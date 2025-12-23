import java.util.Scanner;

class VowelAndConstants2
{
    //Method to check character type
    public static String checkCharacter(char ch)
    {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
        }
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    //Method to find vowels and consonants 
    public static String[][] analyzeString(String text)
    {
        String[][] result = new String[text.length()][2];
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharacter(ch);
        }
        return result;
    }

    //Method to display 2D array
    public static void displayTable(String[][] data)
    {
        System.out.println("\nCharacter\tType");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" + data[i][1]);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        //Take user input
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String[][] result = analyzeString(str);

        //Display result
        displayTable(result);

        sc.close();
    }
}
