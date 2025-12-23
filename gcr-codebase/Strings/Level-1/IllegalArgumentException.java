import java.util.Scanner;

public class IllegalArgumentException {

    //Method that generates exception
   public static void generateException(String str) {

        //Exception : endings are smaller then starting
        System.out.println(str.substring(5, 2));  
    }

    //Method that  handling IllegalArgumentException
    public static void handleException(String str) {
        try {
            int start = 5;
            int end = 2;

            if (start > end) {
                throw new IllegalArgumentException("Start index cannot be greater than end index");
            }

            System.out.println(str.substring(start, end));

        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e.getMessage());

        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input text from user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Call method to generate exception
        //generateException(input);

        // Call method to handle the exception
        handleException(input);

        sc.close();
    }
}
