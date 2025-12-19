import java.util.Scanner;
public class OddOrEven{
public static void main(String args[]){
       

        //Take the number from user
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        //Using for loop check every number is odd or even and display odd and even 
        for(int i=1; i<=number; i++){
               if(i%2 == 0){
                System.out.println("Even number : "+ i);
              }else{
                 System.out.println("Odd number : "+ i);
             }
          }

      

    }
}