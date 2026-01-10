package com.searching.binarysearch;

import java.util.Scanner;

public class PeakElementBinarySearch {

    // Method to find any one peak element index
    public static int findPeakElement(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int n = arr.length;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            //Check if mid is peak
            boolean leftOk = (mid == 0) || (arr[mid] > arr[mid - 1]);
            boolean rightOk = (mid == n - 1) || (arr[mid] > arr[mid + 1]);

            if (leftOk && rightOk) {
                return mid; 
            }

            if (mid > 0 && arr[mid] < arr[mid - 1]) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int peakIndex = findPeakElement(arr);

        // Output
        System.out.println("Peak Element Index: " + peakIndex);
        System.out.println("Peak Element Value: " + arr[peakIndex]);

        sc.close();
    }
}

