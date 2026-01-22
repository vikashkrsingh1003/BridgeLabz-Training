package com.day10.medwarehouse;

import java.util.*;

public class MedWareHouse {

    // Merge function
    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        while (i < n1)
            arr[k++] = L[i++];

        while (j < n2)
            arr[k++] = R[j++];
    }

    // Merge Sort function
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    public static void main(String[] args) {

        //Expiry dates (YYYYMMDD format)
        int[] expiryDates = {
            20240115, 20240210, 20240105,
            20240320, 20240201, 20240130
        };

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(expiryDates));

        mergeSort(expiryDates, 0, expiryDates.length - 1);

        System.out.println("\nAfter Sorting (By Expiry Date):");
        System.out.println(Arrays.toString(expiryDates));

        System.out.println("\n Medicines nearing expiration:");
        for (int date : expiryDates) {
            if (date <= 20240131) {
                System.out.println("Expiry Date: " + date);
            }
        }
    }
}
