import java.util.Scanner;
public class FindYoungestOrTallest {
    public static void main(String agr[]){
     
    //Take the input age and height from user
        Scanner sc = new Scanner(System.in);
        int amarHeight = sc.nextInt();
        int akbarHeight = sc.nextInt();
        int AnthonyHeight = sc.nextInt();

        int amarAge = sc.nextInt();
        int akbarAge = sc.nextInt();
        int anthonyAge = sc.nextInt();

       
    //Find the youngest friend and the tallest friend 
    String youngest, tallest;

    if(amarAge <= akbarAge && amarAge <= anthonyAge){
        youngest = "Amar";
    } else if(akbarAge <= amarAge && akbarAge <= anthonyAge){
        youngest = "Akbar";
    } else{
        youngest = "Anthony";
    }

    if(amarHeight >= akbarHeight && amarHeight >= anthonyHeight){
        tallest = "Amar";
    } else if(akbarHeight >= amarHeight && akbarHeight >= anthonyHeight){
        tallest = "Akbar";
    } else{
        tallest = "Anthony";
    }

    //Displaying the youngest and tallest friend in one line
    System.out.println("Youngest friend is " + youngest + " and tallest friend is " + tallest);

    
   }
}