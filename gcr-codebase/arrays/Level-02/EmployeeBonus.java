//Creating a class named EmployeeBonus purpose 
//to Calculate the total bonus payout, total old and new salary of all the employees
import java.util.Scanner;

class EmployeeBonus {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create all the arrays
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        // Declare the variables to store totals
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Taking Input using For Loop for 10 employees
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for Employee " + (i + 1));
            System.out.print("Enter salary: ");
            salary[i] = input.nextDouble();

            System.out.print("Enter years of service: ");
            yearsOfService[i] = input.nextDouble();

            // Checking Inout is valid or not
            if (salary[i] <= 0 || yearsOfService[i] < 0) {
                System.out.println("Invalid input. Please enter again.");
                i--;
                continue;
            }

            totalOldSalary = totalOldSalary + salary[i];
        }

        // Calculate bonus and new salary using for-loop
        for (int i = 0; i < 10; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05; // 5% bonus
            } 
            else {
                bonus[i] = salary[i] * 0.02; // 2% bonus
            }
            newSalary[i] = salary[i] + bonus[i];
            totalBonus = totalBonus + bonus[i];
            totalNewSalary = totalNewSalary + newSalary[i];
        }

        // Printing the results
        System.out.println("Total Old Salary of all employees: " + totalOldSalary);
        System.out.println("Total Bonus Payout by Zara: " + totalBonus);
        System.out.println("Total New Salary of all employees: " + totalNewSalary);

        input.close();
    }
}
