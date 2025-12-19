import java.util.*;
public class CanVote {
    public static void main(String[] args) {
     
     //Take the input 10 student age from user  
    Scanner sc = new Scanner(System.in);
    int StudentAge[] = new int[10];

    //iterate the loop and take the input age one by one
    for(int i=0; i<10;i++){
       int age = sc.nextInt();

       //check eligibility condition 
       if(age < 0){
        System.out.println("invalid age");
       }else if(age >= 18){
        System.out.println("The student with the age "+ age +" can vote");
       }else{
        System.out.println("The student with the age "+ age +" cannot vote");
       }
    }
    
   }
    
}