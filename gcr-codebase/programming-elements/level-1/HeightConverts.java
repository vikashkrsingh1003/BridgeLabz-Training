import java.util.Scanner;
public class HeightConverts{
    public static void main(String args[]){
       
        //take the input height in centimeter  from user
        Scanner sc = new Scanner(System.in);
        double centimeter = sc.nextDouble();

        //convert centimeter to inch and feet

        double inch = centimeter/2.54;
        double feet = centimeter/30.48;

        //displaying the height in centimeter , inch and feet in oneline:

        System.out.println("Your Height in cm is "+ centimeter +" while in feet is "+ feet + " and inches is "+ inch);

    }
}