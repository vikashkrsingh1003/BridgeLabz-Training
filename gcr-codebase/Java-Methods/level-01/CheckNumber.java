import java.util.*;
public class CheckNumber {
    
    //create the method for check number its positive.nagetive and zero 
     public static int checkNumbers(int number){

        if(number > 0){
            return 1;
        }else if(number == 0){
           return 0;
        }else{
             return -1;
        }
     }

       public static void main(String[] args) {
        
        //Taking an input number from user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int number = sc.nextInt();

        // Calling  method and displaying results 
        int result = checkNumbers(number);
        System.out.println(" Number is :  " + result);

        sc.close();
    }

}