package com.day08.flashdealz;

public class DiscountSorter {

    public void quickSort(int[] discounts, int low, int high) {

        if (low < high) {

            int pivotIndex = partition(discounts, low, high);

            quickSort(discounts, low, pivotIndex - 1);
            quickSort(discounts, pivotIndex + 1, high);
        }
    }

    private int partition(int[] discounts, int low, int high) {

        int pivot = discounts[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (discounts[j] <= pivot) {
                i++;

                int temp = discounts[i];
                discounts[i] = discounts[j];
                discounts[j] = temp;
            }
        }

        int temp = discounts[i + 1];
        discounts[i + 1] = discounts[high];
        discounts[high] = temp;

        return i + 1;
    }
}