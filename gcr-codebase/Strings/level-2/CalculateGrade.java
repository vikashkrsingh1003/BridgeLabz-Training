import java.util.Random;
import java.util.Scanner;

class CalculateGrade
{
    //Method to generate random digit
    public static int[][] generatePCMScores(int students)
    {
        int[][] pcm = new int[students][3];
        Random rand = new Random();

        for (int i = 0; i < students; i++) {
            pcm[i][0] = rand.nextInt(51) + 50; // Physics
            pcm[i][1] = rand.nextInt(51) + 50; // Chemistry
            pcm[i][2] = rand.nextInt(51) + 50; // Maths
        }
        return pcm;
    }

    //Method to calculate total, average and percentage
    public static double[][] calculateResults(int[][] pcm)
    {
        double[][] result = new double[pcm.length][3];

        for (int i = 0; i < pcm.length; i++) {
            int total = pcm[i][0] + pcm[i][1] + pcm[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            result[i][0] = total;
            result[i][1] = average;
            result[i][2] = percentage;
        }
        return result;
    }

    //Method to calculate grade
    public static String[][] calculateGrade(double[][] results)
    {
        String[][] grades = new String[results.length][1];

        for (int i = 0; i < results.length; i++) {
            double percent = results[i][2];

            if (percent >= 80) grades[i][0] = "A";
            else if (percent >= 70) grades[i][0] = "B";
            else if (percent >= 60) grades[i][0] = "C";
            else if (percent >= 50) grades[i][0] = "D";
            else if (percent >= 40) grades[i][0] = "E";
            else grades[i][0] = "R";
        }
        return grades;
    }

    //Method to display scorecard
    public static void displayScoreCard(int[][] pcm, double[][] results, String[][] grades)
    {
        System.out.println("\nStudent\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");

        for (int i = 0; i < pcm.length; i++) {
            System.out.println((i + 1) + "\t" +
                    pcm[i][0] + "\t" +
                    pcm[i][1] + "\t" +
                    pcm[i][2] + "\t" +
                    (int)results[i][0] + "\t" +
                    results[i][1] + "\t" +
                    results[i][2] + "\t" +
                    grades[i][0]);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] pcmScores = generatePCMScores(n);
        double[][] results = calculateResults(pcmScores);
        String[][] grades = calculateGrade(results);
        
        //Display results
        displayScoreCard(pcmScores, results, grades);

        sc.close();
    }
}
