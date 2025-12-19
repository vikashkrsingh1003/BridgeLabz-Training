import java.util.*;

public class LeapYear {
    public static void main(String args[]){

    //Get the input from the user
    Scanner sc = new Scanner(System.in);
    int year = sc.nextInt();

    //Check leap year using multiple if else
    if(year >= 1582){
        if(year % 400 == 0){
            System.out.println("Year is a Leap Year");
        }
        else if(year % 100 == 0){
            System.out.println("Year is not a Leap Year");
        }
        else if(year % 4 == 0){
            System.out.println("Year is a Leap Year");
        }
        else{
            System.out.println("Year is not a Leap Year");
        }
    }
    else{
        System.out.println("Year is not valid");
    }
    }
}
