import java.util.*;

public class LeapYear2 {
    public static void main(String args[]){

    //Get the input from the user
    Scanner sc = new Scanner(System.in);
    int year = sc.nextInt();

    //Check leap year using single if condition
    if(year >= 1582 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))){
        System.out.println("Year is a Leap Year");
    }
    else{
        System.out.println("Year is not a Leap Year");
    }
    }
}
