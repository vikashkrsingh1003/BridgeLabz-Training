package com.day02.universitymanagementsystem;

import java.util.Scanner;

public class UniversityEnrollApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

     
        System.out.println("Enter Undergraduate Details:");
        System.out.println("-------------------------------");
        System.out.print("Enrollment No: ");
        String ugEnroll = sc.nextLine();

        System.out.print("Admission Year: ");
        int ugYear = sc.nextInt();

        sc.nextLine();
        System.out.print("Name: ");
        String ugName = sc.nextLine();

        System.out.print("Age: ");
        int ugAge = sc.nextInt();

        System.out.print("CGPA: ");
        double ugCgpa = sc.nextDouble();

        Student ug = new UnderGraduate(ugEnroll, ugYear, ugName, ugAge, ugCgpa);

     
        sc.nextLine(); 
        System.out.println("\nEnter Postgraduate Details:");
        System.out.println("-------------------------------");
        System.out.print("Enrollment No: ");
        String pgEnroll = sc.nextLine();

        System.out.print("Admission Year: ");
        int pgYear = sc.nextInt();

        sc.nextLine();
        System.out.print("Name: ");
        String pgName = sc.nextLine();

        System.out.print("Age: ");
        int pgAge = sc.nextInt();

        System.out.print("CGPA: ");
        double pgCgpa = sc.nextDouble();

        sc.nextLine();
        System.out.print("Specialization: ");
        String specialization = sc.nextLine();

        Postgraduate pg = new Postgraduate(pgEnroll, pgYear, pgName, pgAge, pgCgpa, specialization);

        
        System.out.println("\nEnter Faculty Details:");
        System.out.println("-------------------------------");
        System.out.print("Faculty ID: ");
        int facultyId = sc.nextInt();

        sc.nextLine();
        System.out.print("Faculty Name: ");
        String facultyName = sc.nextLine();

        System.out.print("Subject: ");
        String subject = sc.nextLine();

        Faculty teacher = new Faculty(facultyId, facultyName, subject);

        
       //Display information 
        ug.displayInfo();
        pg.displayInfo();
        teacher.displayInfo();

        sc.close();
    }
}
