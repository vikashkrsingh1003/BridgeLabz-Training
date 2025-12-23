import java.util.Scanner;

class ConvertToLowercase
{
    //Method to convert text to lowercase 
    public static String convertToLowercase(String text)
    {
        String result = "";
        for(int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
                if(ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);             }
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

        //Take input
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        
        String str1 = convertToLowercase(str);
        String str2 = str.toLowerCase();
        
        //Compare both results
        boolean isSame = compareStrings(str1 , str2);
        
        //Display results
        System.out.println("Lowercase : " + str1);
        System.out.println("Lowercase : " + str2);
        System.out.println("Both results are same: " + isSame);

        sc.close();
    }
}