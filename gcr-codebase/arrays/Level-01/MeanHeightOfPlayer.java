import java.util.*;
public class MeanHeightOfPlayer {
    public static void main(String[] args) {
        
        //create the scanner object and array 
        Scanner sc = new Scanner(System.in);
        double height[] = new double[11];
        
        //take the height input of each player
        int sumHeight =0;
        for(int i=0;i<11;i++){
            height[i]= sc.nextDouble();
            sumHeight += height[i];
        }

      //calculate the mean and displaying the result
       double meanHeight = sumHeight/11;
      System.out.println("The mean height of football team is :"+ meanHeight);

    }
}