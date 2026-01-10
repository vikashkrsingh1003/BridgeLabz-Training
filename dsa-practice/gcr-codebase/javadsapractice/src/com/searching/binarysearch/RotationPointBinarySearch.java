package com.searching.binarysearch;

import java.util.Scanner;

public class RotationPointBinarySearch {

    // Method to find index of smallest element
    public static int findRotationPoint(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        // Binary Search
        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        //left == right then  rotation point index
        return left;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        //input array elements
        System.out.println("Enter the rotated sorted array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int rotationIndex = findRotationPoint(arr);

        // Output
        System.out.println("Rotation Point Index: " + rotationIndex);
        System.out.println("Smallest Element: " + arr[rotationIndex]);

        sc.close();
    }
}

