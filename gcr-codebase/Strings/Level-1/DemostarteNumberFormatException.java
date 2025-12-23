import java.util.*;

class DemostarteNumberFormatException
{
         public void generateException(String text)
         {
            int number = Integer.parseInt(text);
         }
       
        public void demonstrateException(String text)
        {
           try{
                int number = Integer.parseInt(text);
               }
          catch(IllegalArgumentException e){
               System.out.println("DemostarteNumberFormatException is : " + e.getMessage());
                 }
               catch(Exception e){
               System.out.println("Generic Exception : " + e.getMessage());
           }
        }

        public static void main(String[] args)
        {
           Scanner sc = new Scanner(System.in);
                  
          //Take user input as string
          System.out.print("Enter a value : ");
          String str = sc.nextLine();

           DemostarteNumberFormatException obj = new DemostarteNumberFormatException();
          try{
               obj.generateException(str);
          }
           catch(java.lang.NumberFormatException e){
                obj.demonstrateException(str);
                    System.out.println("DemostarteNumberFormatException is: " + e.getMessage());
            }
                   
                  sc.close();                               
         }
}