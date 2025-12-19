import java.util.*;

public class CheckNumber {
    public static void main(String[] args) {
       
       //Create Scanner Object and create array size of 5
        Scanner sc = new Scanner(System.in);
        int number[] = new int[5];

        //Take input and check each number
        for (int i = 0; i < 5; i++) {
            number[i] = sc.nextInt();

            if (number[i] > 0) {
                if (number[i] % 2 == 0) {
                    System.out.println("Number is positive and 'even' ");
                } else {
                    System.out.println("Number is positive and 'odd' ");
                }
            } else if (number[i] == 0) {
                System.out.println("Number is zero");
            } else {
                System.out.println("Number is negative");
            }
        }

        // Compare first and last element 
        if (number[0] > number[number.length - 1]) {
            System.out.println(number[0] + " is greater than " + number[number.length - 1]);
        } else if (number[0] < number[number.length - 1]) {
            System.out.println(number[number.length - 1] + " is greater than " + number[0]);
        } else {
            System.out.println(number[0] + " == " + number[number.length - 1]);
        }

        sc.close();
    }
}
