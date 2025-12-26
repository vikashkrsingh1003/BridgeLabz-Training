import java.util.*;
public class ReverseString{
    public static void main(String[] args) {
        
        //Take a input String from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a text : ");
        String text = sc.nextLine();
         
        String reverse = "";
        for (int i=text.length()-1;i>=0 ;i-- ) {
            reverse += text.charAt(i);
        }
        System.out.println("reverse string is: "+ reverse);
    }
}