import java.util.*;
public class AthleteRound {
    
    //create the method 
     public static double  calculateAthleteRound (double side1,double side2,double side3){
        
        double totalside = side1+side2+side3;

        double round = 5000/totalside; //5km convert into meter 5000m

        return round;
     }

       public static void main(String[] args) {
        
        //Taking an input all sides of tyringle in Cm from user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 1st side of tringle in meter  : ");
        double side1 = sc.nextDouble();

        System.out.println("Enter the 2nd side of tringle in meter: ");
        double side2 = sc.nextDouble();

        System.out.println("Enter the 3rd side of tringle in meter : ");
        double side3 = sc.nextDouble();

        // Calling  method and displaying results 
        double result = calculateAthleteRound ( side1 , side2, side3 );
        System.out.println("Athlete runs the : " + result +"round ");

        sc.close();
    }

}