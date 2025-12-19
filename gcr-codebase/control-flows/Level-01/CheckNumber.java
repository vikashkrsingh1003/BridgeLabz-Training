import java.util.Scanner;
public class CheckNumber {
    public static void main(String args[]){

    //Take the number input from the user
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

    //condition check positive , negative and zero and display results 
        if(number > 0){
            System.out.println("Number :"+number+ " is Positive");
        }else if(number == 0){
            System.out.println("Number :"+number+ " is Zero");
        }else{
             System.out.println("Number :"+number+ " is Negative");
        }


    }
} 