import java.util.*;

public class CheckNumber {

    public static void checkOddEven(int num){

        if(num<0){
            return;
        }else if(num % 2==0){
             System.out.println("number is even");
        }else{
            System.out.println("number is odd");
        }

    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("check number" + checkOddEven(12));
    }
}