import java.util.Scanner;

public class AreaOfTriangle{
    public static void main(String args[]){

    //creating the Scanner obj and taking input base and height in centimeter  from user
        Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble();
        double height = sc.nextDouble();

    //Calculate the area of circle in centimeter and covert into inch and feet 
       double area = 0.5*base*height;  
       double inch = area/2.54;
       double feet = area/30.48;

    //Displaying the area in centimeter , inch and feet
       System.out.println("Your Height in cm is :"+ area+" while in feet is :"+feet+" and inches is "+ inch);

      
    }
}