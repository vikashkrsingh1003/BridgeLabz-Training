import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    //Method to generate a random number within a range
    public static int generateGuess(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    // Method to get user feedback
    public static String getUserFeedback(Scanner sc) {
        System.out.print("Is the guess too high, too low, or correct?: ");
        return sc.nextLine().toLowerCase();
    }

    //Method to adjust range based on feedback
    public static void updateRange(String feedback, int[] range, int guess) {
        if (feedback.equals("low")) {
            range[0] = guess + 1;
        } else if (feedback.equals("high")) {
            range[1] = guess - 1; 
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min = 1;
        int max = 100;
        int guess;
        String feedback;

        System.out.println("Think of a number between 1 and 100.");
        System.out.println("Press Enter when you're ready...");
        scanner.nextLine();

        int[] range = {min, max};

        while (true) {
            guess = generateGuess(range[0], range[1]);
            System.out.println("Computer guesses: " + guess);

            feedback = getUserFeedback(scanner);

            if (feedback.equals("correct")) {
                System.out.println("Yay! The computer guessed your number correctly!");
                break;
            } else if (feedback.equals("low") || feedback.equals("high")) {
                updateRange(feedback, range, guess);
            } else {
                System.out.println("Invalid input. Please enter high, low, or correct.");
            }
        }

        scanner.close();
    }
}
