import java.util.Scanner;

class TrimSpaces
{
    //Method to find start and end index 
    public static int[] findTrimIndexes(String text)
    {
        int start = 0;
        int end = text.length() - 1;
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }
        return new int[]{start, end};
    }

    //Method to create substring 
    public static String createSubstring(String text, int start, int end)
    {
        String result = "";
        for (int i = start; i <= end; i++) {
            result = result + text.charAt(i);
        }
        return result;
    }

    //Method to compare two strings
    public static boolean compareStrings(String s1, String s2)
    {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter text with spaces: ");
        String text = sc.nextLine();

        int[] indexes = findTrimIndexes(text);
        String customTrimmed = "";

        if (indexes[0] <= indexes[1]) {
            customTrimmed = createSubstring(text, indexes[0], indexes[1]);
        }

        String builtInTrimmed = text.trim();
        boolean isSame = compareStrings(customTrimmed, builtInTrimmed);

        // Display results
        System.out.println("\nTrimmed (User Defined): '" + customTrimmed + "'");
        System.out.println("Trimmed (Built-in):    '" + builtInTrimmed + "'");
        System.out.println("Both results are same: " + isSame);

        sc.close();
    }
}
