import java.util.*;
public class FindingSquareSides{
   public static void main(String args[]){

     //Taking the parameter of side from user
    Scanner sc = new Scanner(System.in);
    double perimeter = sc.nextDouble();

    //calculate the side of square
     double side  = perimeter/4;

     //displaying the side of squre 
     System.out.println("The length of the side is : "+ side + " whose perimeter is : "+ perimeter);
   } 

}