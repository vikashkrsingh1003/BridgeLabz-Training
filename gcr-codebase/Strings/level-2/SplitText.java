import java.util.Scanner;

class SplitText
{
    //Method to find length of the string without using length()
    public static int findLength(String text) {
        int count = 0;

        for (char c : text.toCharArray()) {
            count++;
        }

        return count;
    }

    //Method to split text into words 
    public static String[] customSplit(String text)
    {
        int length = findLength(text);
        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        int[] spaceIndex = new int[wordCount + 1];
        int idx = 0;
        spaceIndex[idx++] = -1;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndex[idx++] = i;
            }
        }
        spaceIndex[idx] = length;

        String[] words = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            String word = "";
            for (int j = spaceIndex[i] + 1; j < spaceIndex[i + 1]; j++) {
                word = word + text.charAt(j);
            }
            words[i] = word;
        }
        return words;
    }

    //Method to compare two String arrays
    public static boolean compareArrays(String[] arr1, String[] arr2)
    {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
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

        String[] customWords = customSplit(text);
        String[] builtInWords = text.split(" ");
        boolean result = compareArrays(customWords, builtInWords);

        // Display result
        System.out.println("Both split results are same: " + result);

        sc.close();
    }
}
