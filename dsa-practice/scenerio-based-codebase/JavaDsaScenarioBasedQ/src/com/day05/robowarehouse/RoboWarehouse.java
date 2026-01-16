package com.day05.robowarehouse;

import java.util.Arrays;

public class RoboWarehouse {

    // Insertion Sort
    static void insertionSort(int[] weights) {
        for (int i = 1; i < weights.length; i++) {
            int key = weights[i];
            int j = i - 1;

            // Shift elements greater than key to the right
            while (j >= 0 && weights[j] > key) {
                weights[j + 1] = weights[j];
                j--;
            }

            // Insert key at correct position
            weights[j + 1] = key;
        }
    }

    // Main method
    public static void main(String[] args) {
        int[] packageWeights = {50, 20, 40, 10, 30};

        System.out.println("Unsorted : ");
        System.out.println(Arrays.toString(packageWeights));

        insertionSort(packageWeights);

        System.out.println("\n package weights sorted:");
        System.out.println(Arrays.toString(packageWeights));
    }
}

