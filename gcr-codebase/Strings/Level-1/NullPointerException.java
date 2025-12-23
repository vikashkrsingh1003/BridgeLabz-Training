public class NullPointerException {

    // Method to generate NullPointerException
    public static void generateException() {
       // text initialized to null
        String text = null;   

        // This line will generate NullPointerException
        System.out.println(text.length());
    }

    // Method to handle NullPointerException
    public static void handleException() {

        String text = null;   

        try {
            System.out.println(text.length());
        } catch (NullPointerException exception) {
            System.out.println("NullPointerException caught!");
            System.out.println("Reason: Trying to access a method on a null object.");
        }
    }

    public static void main(String[] args) {

        // Calling method that generates exception
        System.out.println("Generating NullPointerException:");
        generateException();

        //Calling method that handling the exception
        System.out.println("\nHandling NullPointerException:");
        handleException();
    }
}
