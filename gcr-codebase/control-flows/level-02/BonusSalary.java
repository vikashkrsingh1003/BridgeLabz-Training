import java.util.*;
public class BonusSalary {
    public static void main(String args[]){

        //Take the input Salary and experience year frrom user
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        int serviceYear = sc.nextInt();

        //check the condition and find the bonus amount
        if(serviceYear > 5){

             double bonus = salary * ((double)5/100);
             System.out.println("Bonus is :" + bonus);
        } 
       
    }
}