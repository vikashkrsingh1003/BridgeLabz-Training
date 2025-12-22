import java.util.Scanner;

public class YoungestFriends {

       //Method to find the youngest friend
       public static int findYoungest(int[] ages){
          int minAge = ages[0];
          for(int i=1; i < ages.length; i++){
               if(ages[i] < minAge)
                 minAge = ages[i]; 
          }
          return minAge;
       }
       
       //Method to find the tallest friend
       public static double findTallest(double[] heights){
          double maxHeight = heights[0];
          for(int i=1; i < heights.length; i++){
               if(heights[i] > maxHeight)
                 maxHeight = heights[i]; 
          }
          return maxHeight;
       }

      
      public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         String[] names = {"Amar", "Akbar", "Anthony"};
          int[] ages = new int[3];
          double[] heights = new double[3];
          
          //Taking input for age and height
          for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();

            System.out.print("Enter height of " + names[i] + ": ");
            heights[i] = sc.nextDouble();
          }
          
          int youngestAge = findYoungest(ages);
          double tallestHeight = findTallest(heights);

          //Display youngest friend
          for (int i = 0; i < 3; i++) {
            if (ages[i] == youngestAge) {
                System.out.println("Youngest friend is " + names[i] + " with age " + youngestAge);
                break;
            }
          }

         //Display tallest friend
         for (int i = 0; i < 3; i++) {
            if (heights[i] == tallestHeight) {
                System.out.println("Tallest friend is " + names[i] + " with height " + tallestHeight);
                break;
            }
          }

          sc.close();
       }
}
