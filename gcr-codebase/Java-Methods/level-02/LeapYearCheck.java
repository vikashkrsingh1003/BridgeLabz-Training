import java.util.*;
public class LeapYearCheck {
    //Method to check leap year or not
     public static boolean CheckLeapYear(int year){

       if(year >= 1582 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))
               return true;
         else
            return false;
        }

public static void main(String args[]){

    //Take the input year from the user
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the years :")
    int year = sc.nextInt();
     
    //Calling the method and Displaying results
    boolean result = CheckLeapYear(year);

    System.out.println(year + "is leap year ? "+ result);
   
    }
}