package com.day05.loanbuddy;

import java.util.Scanner;

public class LoanBuddyApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Credit Score: ");
        int creditScore = sc.nextInt();

        System.out.print("Enter Monthly Income: ");
        double income = sc.nextDouble();

        System.out.print("Enter Loan Amount: ");
        double loanAmount = sc.nextDouble();

        System.out.print("Loan Type (personal/home/auto): ");
        String loanType = sc.next();

        System.out.print("Loan Term (months): ");
        int term = sc.nextInt();

        Applicant applicant = new Applicant(name, creditScore, income, loanAmount);
        LoanApplication loan;

        switch (loanType.toLowerCase()) {
            case "home":
                loan = new HomeLoan(applicant, term);
                break;
            case "auto":
                loan = new AutoLoan(applicant, term);
                break;
            default:
                loan = new PersonalLoan(applicant, term);
        }

        if (loan.approveLoan()) {
            System.out.println("Loan Approved!");
            System.out.println("Monthly EMI: " + loan.calculateEMI());
        } else {
            System.out.println("Loan Rejected");
        }

        sc.close();
    }
}

