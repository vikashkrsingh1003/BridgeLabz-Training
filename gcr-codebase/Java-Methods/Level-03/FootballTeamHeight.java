import java.util.Random;

public class FootballTeamHeight {

    // Method to find the sum of all elements in the array
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int h : heights) {
            sum += h;
        }
        return sum;
    }

    //Method to find the mean height
    public static double findMean(int[] heights) {
        int sum = findSum(heights);
        return (double) sum / heights.length;
    }

    //Method to find the shortest height
    public static int findShortest(int[] heights) {
        int shortest = heights[0];
        for (int h : heights) {
            if (h < shortest) {
                shortest = h;
            }
        }
        return shortest;
    }

    //Method to find the tallest height
    public static int findTallest(int[] heights) {
        int tallest = heights[0];
        for (int h : heights) {
            if (h > tallest) {
                tallest = h;
            }
        }
        return tallest;
    }

    public static void main(String[] args) {

        //Create an int array of size 11
        int[] heights = new int[11];
        Random random = new Random();

        //Generate random heights between 150 cm and 250 cm
        for (int i = 0; i < heights.length; i++) {
            heights[i] = random.nextInt(101) + 150; 
        }

        //Displaying the  player heights
        System.out.println("Heights of football players :");
        for (int h : heights) {
            System.out.print(h + " ");
        }
        System.out.println();

        //Displaying results Shortest Height , Tallest Height and Mean Height
        System.out.println("Shortest Height: " + findShortest(heights) + " cm");
        System.out.println("Tallest Height: " + findTallest(heights) + " cm");
        System.out.println("Mean Height: " + findMean(heights) + " cm");
    }
}
