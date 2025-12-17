import java.util.Scanner;

class SimpleInterest{
    public static void main(String[] args) {
   
    //Take the input principle , rate and time from user:
        Scanner sc = new Scanner(System.in);
        double principal = sc.nextDouble();
        double rate = sc.nextDouble();
        double time = sc.nextDouble();
     
     //Calclate the simple intrest using formula
        double simpleInterest = (principal * rate * time) / 100;
     
     //Displaying the final intrest money:
        System.out.println("simple intrest is : " + simpleInterest);
       
    }
}