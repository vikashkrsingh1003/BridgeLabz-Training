package com.collections.insurancepolicymanagementsystem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PolicyManager manager = new PolicyManager();

        System.out.print("Enter policy number: ");
        int number = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter policy holder name: ");
        String name = sc.nextLine();

        System.out.print("Enter expiry date (yyyy-MM-dd): ");
        String expiry = sc.nextLine();

        Policy policy = new Policy(number, name, expiry);
        manager.addPolicy(policy);

        System.out.println("\nPolicy by number:");
        System.out.println(manager.getPolicy(number));

        System.out.println("\nPolicies for holder:");
        manager.getSpecificPolicyHolder(name);

        System.out.println("\nPolicies expiring in next 30 days:");
        manager.getPoliciesExpiringInNext30Days();
        
        sc.close();
    }
}
