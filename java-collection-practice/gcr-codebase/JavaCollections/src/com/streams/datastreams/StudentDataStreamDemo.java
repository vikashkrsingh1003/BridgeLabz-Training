package com.streams.datastreams;

import java.io.*;

public class StudentDataStreamDemo {

    public static void main(String[] args) {

        String filePath = "All-File/student.dat";

        try (
            FileOutputStream fos = new FileOutputStream(filePath);
            DataOutputStream dos = new DataOutputStream(fos)
        ) {

            dos.writeInt(101);              
            dos.writeUTF("Vikash");         
            dos.writeDouble(8.45);      

            System.out.println("Student data written successfully");

        } catch (IOException e) {
            e.printStackTrace();
        }

     
        try (
            FileInputStream fis = new FileInputStream(filePath);
            DataInputStream dis = new DataInputStream(fis)
        ) {

            int roll = dis.readInt();
            String name = dis.readUTF();
            double gpa = dis.readDouble();

            System.out.println("\nStudent Details:");
            System.out.println("Roll No: " + roll);
            System.out.println("Name   : " + name);
            System.out.println("GPA    : " + gpa);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
