package com.day09.foodfest;

public class FoodFest {

    public static Stall[] mergeSort(Stall[] arr, int left, int right) {
        if (left == right) {
            return new Stall[]{ arr[left] };
        }

        int mid = (left + right) / 2;

        Stall[] leftArr = mergeSort(arr, left, mid);
        Stall[] rightArr = mergeSort(arr, mid + 1, right);

        return merge(leftArr, rightArr);
    }

    private static Stall[] merge(Stall[] left, Stall[] right) {
        Stall[] result = new Stall[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i].footfall <= right[j].footfall) { // Stability preserved
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        while (i < left.length)
            result[k++] = left[i++];

        while (j < right.length)
            result[k++] = right[j++];

        return result;
    }

    public static void main(String[] args) {
        Stall[] stalls = {
            new Stall("Burger Hub", 250),
            new Stall("Pizza Point", 400),
            new Stall("Taco Town", 400),
            new Stall("Noodle Bar", 150)
        };

        Stall[] sortedStalls = mergeSort(stalls, 0, stalls.length - 1);

        System.out.println("Sorted Stalls by Footfall:");
        for (Stall s : sortedStalls) {
            System.out.println(s.stallName + " - " + s.footfall);
        }
    }
}