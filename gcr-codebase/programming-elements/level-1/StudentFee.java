import java.util.Scanner;

public class StudentFee{
    public static void main(String args[]){
       
       //Take the fee and discountPercent from user
        Scanner sc = new Scanner(System.in);
        int fee = sc.nextInt();
        int discountPrecent = sc.nextInt();
       
       //Calculate the discount amount and final fee 
        double discount = fee * ((double)discountPrecent/ 100);
        double finalFee = fee - discount;

        //print the discount amount and final fee
        System.out.println("The discount amount is INR : "+ discount + " and final discounted fee is INR : "+  finalFee);
    }
}