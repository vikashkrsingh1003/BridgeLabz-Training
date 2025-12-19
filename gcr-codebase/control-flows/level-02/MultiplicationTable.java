import java.util.*;
public class MultiplicationTable {
    public static void main(String args[]){

      //Intialize the range of multiplication
        int number1 = 6;
        int number2 = 9;
    
    //Create two for loop calculte the multiplication table:
        for(int i= number1; i<=number2;i++){
                System.out.print(i+ "  MultiplicationTable ");
            for(int j=1 ; j<=10 ; j++){
                System.out.println(i +" * "+ j + " = " + i*j);
            }

            System.out.println("  ");


        }
    }
}