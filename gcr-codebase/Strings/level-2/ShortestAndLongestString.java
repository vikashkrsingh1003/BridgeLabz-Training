import java.util.Scanner;

class ShortestAndLongestString
{
    //Method to find string length 
    public static int findLength(String text)
    {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
                 System.out.println("DemostarteStringIndexOutOfBoundsException is : " + e.getMessage());
        }
        return count;
    }

    //Method to split text into words
    public static String[] splitText(String text)
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

    // Method to create 2D array 
    public static String[][] wordsWithLength(String[] words)
    {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    //Method to find shortest and longest word
    public static int[] findShortestAndLongest(String[][] data)
    {
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < data.length; i++) {
            int length = Integer.parseInt(data[i][1]);
            if (length < Integer.parseInt(data[minIndex][1])) {
                minIndex = i;
            }
            if (length > Integer.parseInt(data[maxIndex][1])) {
                maxIndex = i;
            }
        }
        return new int[]{minIndex, maxIndex};
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        //Take text input
        System.out.print("Enter text: ");
        String text = sc.nextLine();

       
        String[] words = splitText(text);
        String[][] table = wordsWithLength(words);
        int[] result = findShortestAndLongest(table);

        //Display result
        System.out.println("\nShortest word: " + table[result[0]][0]+ " (Length: " + table[result[0]][1] + ")");
        System.out.println("Longest word: " + table[result[1]][0] + " (Length: " + table[result[1]][1] + ")");

        sc.close();
    }
}
