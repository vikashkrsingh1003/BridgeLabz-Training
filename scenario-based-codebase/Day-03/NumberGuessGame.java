import java.util.*;
public class NumberGuessGame{

    public static void main(String[] args) {
        
        int min = 1;
        int max = 100;
        Random random = new Random();
        int number = random.nextInt(max - min + 1) + min;
        int wrongAttempts=0;

        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your Guess number : ")
            int guessNum = sc.nextInt();

            if(guessNum == number){
                System.out.println("You guess right number ");
                break;
            }
            if(guessNum < number){
                System.out.println("Guess Two Low");
                wrongAttempts++;
            }else{
              System.out.println("Guess Two High");
            }

        }while(wrongAttempts < 5);

        if(wrongAttempts>5){
            System.out.println("Wrong Attempts limit exceeded");
        }


    }
}