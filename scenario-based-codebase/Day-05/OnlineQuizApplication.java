// Online Quiz Application 🧠
// Ask 5 questions (MCQs) from a user.
// ● Use arrays and for-loop.
// ● Record score.
// ● Switch for answer checking. Apply clear indentation and structured layout.

import java.util.Scanner;
public class OnlineQuizApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int score = 0;

        //store Questions
        String[] questions = {
            "1. Which language is platform independent?",
            "2. Which keyword is used to inherit a class in Java?",
            "3. Which loop is best when iterations are fixed?",
            "4. Which data type stores true or false?",
            "5. Which method is the entry point of Java?"
        };

        // Options for each question
        String[][] options = {
            {"A. C", "B. Java", "C. Python", "D. HTML"},
            {"A. import", "B. package", "C. extends", "D. implements"},
            {"A. for", "B. while", "C. do-while", "D. foreach"},
            {"A. int", "B. char", "C. boolean", "D. float"},
            {"A. start()", "B. main()", "C. run()", "D. execute()"}
        };

        // Correct answers
        char[] answers = {'B', 'C', 'A', 'C', 'B'};

    
        System.out.println("======================================");
        System.out.println("        ONLINE QUIZ APPLICATION        ");
        System.out.println("======================================");

        // Display quiz
        for (int i = 0; i < questions.length; i++) {

            System.out.println("\n" + questions[i]);

            //Print options
            for (int j = 0; j < 4; j++) {
                System.out.println(options[i][j]);
            }

            System.out.print("Enter your answer (A/B/C/D): ");
            char userAnswer = sc.next().toUpperCase().charAt(0);

            // Switch-case for checking
            switch (userAnswer) {
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                    if (userAnswer == answers[i]) {
                        System.out.println("Correct Answer!");
                        score++;
                    } else {
                        System.out.println("Wrong Answer!");
                    }
                    break;
                default:
                    System.out.println("Invalid option selected!");
            }
        }

        //Displaying the final score 
        System.out.println("--------Test--Completed----------");
        System.out.println("Final Score: " + score + "/5");
        System.out.println("---------------------------------");

        sc.close();
    }
}
