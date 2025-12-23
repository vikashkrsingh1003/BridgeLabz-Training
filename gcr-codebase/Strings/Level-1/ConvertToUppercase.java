import java.util.Scanner;

class ConvertToUppercase
{
    //Method to convert text to uppercase 
    public static String convertToUppercase(String text)
    {
        String result = "";
        for(int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if(ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);             
            }
            result = result + ch;
        }
        return result;
    }

    //Method to compare two strings 
    public static boolean compareStrings(String s1, String s2)
    {
        if(s1.length() != s2.length()) {
            return false;
        }
        for(int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        //Take complete text input
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        //User-defined uppercase conversion
        String customUpper = convertToUppercase(text);
        // Built-in uppercase conversion
        String builtInUpper = text.toUpperCase();
        
        //Display result 
        boolean isSame = compareStrings(customUpper, builtInUpper);
        System.out.println("Uppercase (manual): " + customUpper);
        System.out.println("Uppercase (builtIin): " + builtInUpper);
        System.out.println("Both results are same: " + isSame);

        sc.close();
    }
}
