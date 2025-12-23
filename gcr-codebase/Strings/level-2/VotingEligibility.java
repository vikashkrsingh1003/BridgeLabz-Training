import java.util.Scanner;
import java.util.Random;

class StudentVotingEligibility
{
    //Method to generate random 2-digit
    public static int[] generateAges(int n)
    {
        int[] ages = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(90) + 10; 
        }
        return ages;
    }

    //Method to check voting eligibility
    public static String[][] checkVotingEligibility(int[] ages)
    {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                result[i][1] = "false";
            } else if (ages[i] >= 18) {
                result[i][1] = "true";
            } else {
                result[i][1] = "false";
            }
        }
        return result;
    }

    //Method to display 2D array 
    public static void displayResult(String[][] data)
    {
        System.out.println("\nAge\tCan Vote");
        for (int i = 0; i < data.length; i++) {
            boolean canVote = Boolean.parseBoolean(data[i][1]);
            System.out.println(data[i][0] + "\t" + canVote);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        //Number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] ages = generateAges(n);
        String[][] result = checkVotingEligibility(ages);

        //Display result
        displayResult(result);

        sc.close();
    }
}
