import java.util.*;

public class ZaraBonusCalculator {

    //Generate salary and years of service
    public static double[][] generateEmployeeData(int n) {
        double[][] data = new double[n][2];

        for (int i = 0; i < n; i++) {
            // 5-digit salary (10000 to 99999)
            data[i][0] = 10000 + Math.random() * 90000;

            // Years of service (1 to 10)
            data[i][1] = 1 + Math.random() * 10;
        }
        return data;
    }

    //Calculate bonus and new salary
    public static double[][] calculateBonus(double[][] empData) {
        double[][] result = new double[empData.length][2];

        for (int i = 0; i < empData.length; i++) {
            double salary = empData[i][0];
            double years = empData[i][1];
            double bonus;

            if (years > 5) {
                bonus = salary * 0.05;
            } else {
                bonus = salary * 0.02;
            }

            result[i][0] = salary + bonus; 
            result[i][1] = bonus;
        }
        return result;
    }

    //Display table and totals
    public static void displayResult(double[][] empData, double[][] newData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("Emp\tOldSalary\tYears\tBonus\t\tNewSalary");


        for (int i = 0; i < empData.length; i++) {
            double oldSalary = empData[i][0];
            double years = empData[i][1];
            double newSalary = newData[i][0];
            double bonus = newData[i][1];

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.print("\n"+
                    (i + 1)+ oldSalary + years + bonus + newSalary);
        }


        System.out.println("TOTAL"+
                totalOldSalary+ totalBonus+ totalNewSalary);
    }

    // Main Method
    public static void main(String[] args) {
        int employees = 10;

        double[][] empData = generateEmployeeData(employees);
        double[][] newData = calculateBonus(empData);
        displayResult(empData, newData);
    }
}
