package com.day04.examcell;

import java.util.*;

public class ExamCell {

    // Merge Sort
    static void mergeSort(int[] scores, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(scores, left, mid);
            mergeSort(scores, mid + 1, right);

            merge(scores, left, mid, right);
        }
    }

// Merge two sorted parts
    static void merge(int[] scores, int left, int mid, int right) {

        int[] temp = new int[right - left + 1];

        int i = left, j = mid + 1, k = 0;

        // Merge the two subarrays into temp[]
        while (i <= mid && j <= right) {
            if (scores[i] <= scores[j])
                temp[k++] = scores[i++];
            else
                temp[k++] = scores[j++];
        }

        //Copy remaining elements of left subarray
        while (i <= mid)
            temp[k++] = scores[i++];

        //Copy remaining elements of right subarray
        while (j <= right)
            temp[k++] = scores[j++];

        //Copy temp array back to original array
        for (int x = 0; x < temp.length; x++)
            scores[left + x] = temp[x];
    }

    // Main method
    public static void main(String[] args) {

        int[] studentScores = {78, 92, 85, 67, 90,88, 95, 70, 80, 100 };

        System.out.println("Unsorted Scores:");
        System.out.println(Arrays.toString(studentScores));

        mergeSort(studentScores, 0, studentScores.length - 1);

        System.out.println("\nstate-level Rank List :");
        
        for (int i = 0; i < studentScores.length; i++) {
            System.out.println("Rank " + (i + 1) + " : " + studentScores[i]);
        }
    }
}

