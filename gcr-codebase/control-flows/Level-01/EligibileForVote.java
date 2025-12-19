import java.util.Scanner;
public class EligibileForVote {
    public static void main(String args[]){

        //take the age input from user 
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        //check the eligibility criteria for vote and display 
       if(age >= 18){
          System.out.println("The person's age is "+ age +" and can vote");
       }else{
         System.out.println("The person's age is "+ age +" and cannot vote");
       }

    }
}