import java.util.*;
public class FizzBuzz {
    public static void main(String[] args) {

        //Take the input number from user 
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        
        //create array  to store result and initialize index value
        String result[] = new String[number];
        int index =0;
        
        // for loop 1 to number fo check fizz buzz 
        for (int i = 1; i <= number; i++) {
             
             if(i % 5==0 && i % 3 ==0){
                result[index] = "FizzBuzz";
             }else if(i%5 ==0){
                result[index] = "Buzz";
             }else if(i % 3 ==0){
                result[index] = "Fizz";
             }else{
                result[index] = String.valueOf(i);

             }

             index++;

        }
        //Displaying the result 
        for(int i=0; i<result.length; i++){
            System.out.println("Position " + (i + 1) + " = " + result[i]);
         }

    }
}