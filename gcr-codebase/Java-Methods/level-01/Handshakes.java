import java.util.*;
public class Handshakes {
    
    //create the method 
     public static double  calculateHandshakes (double numberOfStudents ){

        double handshake = (numberOfStudents * (numberOfStudents-1))/2;

         return handshake;
     }

       public static void main(String[] args) {
        
        //Taking an input number of Students from user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        double numberOfStudents = sc.nextDouble();

        // Calling  method and displaying results 
        double result = calculateHandshakes(numberOfStudents);
        System.out.println(" possible handshakes: " + result);

        sc.close();
    }

}