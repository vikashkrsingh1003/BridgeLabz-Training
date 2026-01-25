package com.exceptions.multiplecatch;

import java.util.Scanner;

public class MultipleCatch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = null;   

        try {
           
            arr = new int[]{10, 20, 30, 40, 50};

            //input index
            System.out.print("Enter index: ");
            int index = sc.nextInt();

            //access array element
            int value = arr[index];
            System.out.println("value at index " + index + ": " + value);

        } catch (ArrayIndexOutOfBoundsException e) {
            //Handles invalid index
            System.out.println("Invalid index ");

        } catch (NullPointerException e) {
            //Handles null array
            System.out.println("Arrray is null ");

        } finally {
            sc.close();
        }
    }
}

