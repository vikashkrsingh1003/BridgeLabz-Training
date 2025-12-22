import java.util.Scanner;

public class RandomValues {

    // Method to generate array of 4-digit random numbers
    public int[] generate4DigitRandomArray(int size) {

        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) 
            numbers[i] = (int)(Math.random() * 9000) + 1000;

            return numbers;
         }
  
    //Method to find average, minimum and maximum
    public double[] findAvgMinMax(int[] numbers) {

        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
            min = Math.min(min, numbers[i]);
            max = Math.max(max, numbers[i]);
        }
        double average = (double) sum / numbers.length;

        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        
        RandomValues randomValues = new RandomValues();

        //Called generate4DigitRandomArray method 
        int[] randomNumbers = randomValues.generate4DigitRandomArray(5);

        //Called findAverageMinMax method
        double[] result = randomValues.findAvgMinMax(randomNumbers);

        System.out.println("\nAverage value : " + result[0]);
        System.out.println("Minimum value : " + result[1]);
        System.out.println("Maximum value : " + result[2]);
    }
}
