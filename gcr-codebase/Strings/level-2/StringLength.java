import java.util.Scanner;

class StringLength
{
   //Method to find length of the string without using length()
    public static int findLength(String text) {
        int count = 0;

        for (char c : text.toCharArray()) {
            count++;
        }

        return count;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        //Take input String from user 
        System.out.print("Enter a string: ");
        String str = sc.next();

        int l1 = findLength(str);
        int l2 = str.length();

        //Display results
        System.out.println("Length of String without using length() function: " + l1);
        System.out.println("Length of String using length() function: " + l2);

        sc.close();
    }
}
