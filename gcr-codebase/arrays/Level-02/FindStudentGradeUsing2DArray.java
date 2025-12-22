//creating a class named FindstudentGrade purpose to calculate  grade of students
import java.util.Scanner;

class FindstudentGrade {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //taking input for number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        //create arrays to store marks
        int[][] marks = new int[n][3];   
        double[] percentage = new double[n];
        char[] grade = new char[n];

        //taking input for marks
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));
            System.out.print("Physics: ");
            marks[i][0] = sc.nextInt();
            System.out.print("Chemistry: ");
            marks[i][1] = sc.nextInt();
            System.out.print("Maths: ");
            marks[i][2] = sc.nextInt();

            //handling negative marks
            if (marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0) {
                System.out.println("Please enter positive values: ");
                i--;
                continue;
            }
        }

        //calculating percentage and grade
        for (int i = 0; i < n; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += marks[i][j];
            }
            percentage[i] = (total / 300.0) * 100;
            if (percentage[i] >= 80) {
                grade[i] = 'A';
            } 
            else if (percentage[i] >= 70) {
                grade[i] = 'B';
            } 
            else if (percentage[i] >= 60) {
                grade[i] = 'C';
            } 
            else if (percentage[i] >= 50) {
                grade[i] = 'D';
            } 
            else if (percentage[i] >= 40) {
                grade[i] = 'E';
            } 
            else {
                grade[i] = 'R';
            }
        }

        //printing marks, percentage, and grade
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Physics: " + marks[i][0]);
            System.out.println("Chemistry: " + marks[i][1]);
            System.out.println("Maths: " + marks[i][2]);
            System.out.println("Percentage is: " + percentage[i]);
            System.out.println("Grade is: " + grade[i]);
            System.out.println();
        }

        sc.close();
    }
}
