import java.util.*;
public class CompareString {
     
     public static boolean compareTwoString(String first , String second){
       
         //check length 
        if(first.length() != second.length()){
            return false;
        }
        for(int i=0; i<first.length(); i++){
            if(first.charAt(i) != second.charAt(i)){
                return false;
            }
        }
        return true;

     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Taking the input first and second string from user
        System.out.println("Enter the first strig: ");
        String first = sc.next();

        System.out.println("Enter the Second strig: ");
        String second = sc.next();
       
       //called the methode comparision using charAt method
       boolean charAtresult = compareTwoString(first, second);

       //comaparision using built in .equal method
       boolean equalResult = first.equals(second);
       
        //Displaying the result 
       System.out.println("Result using charAt method: " + charAtresult);
       System.out.println("Result using .equals method: "+ equalResult);

    }

}