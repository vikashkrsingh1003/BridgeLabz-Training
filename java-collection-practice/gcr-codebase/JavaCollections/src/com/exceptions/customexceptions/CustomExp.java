package com.exceptions.customexceptions;

import java.util.Scanner;

public class CustomExp {

    // Method that validates age
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            //taking user input
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

           
            validateAge(age);

            //If no exception occurs
            System.out.println("Access granted!");

        } catch (InvalidAgeException e) {
            // Handling custom exception
            System.out.println(e.getMessage());

        } finally {
            sc.close();
        }
    }
}

