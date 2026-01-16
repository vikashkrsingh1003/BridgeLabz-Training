package com.day04.zipzipmart;

public class ZipZipMart {

    static class Sale {
        int date;
        int amount;
        String branch;

        Sale(int date, int amount, String branch) {
            this.date = date;
            this.amount = amount;
            this.branch = branch;
        }
    }

    // Merge Sort function
    static void mergeSort(Sale[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    // Merge function for Sale[]
    static void merge(Sale[] arr, int l, int m, int r) {
        Sale[] temp = new Sale[r - l + 1];

        int i = l;
        int j = m + 1;
        int k = 0;

        while (i <= m && j <= r) {
        	
            // Sorting by amount 
            if (arr[i].amount <= arr[j].amount)
                temp[k++] = arr[i++];
            else
                temp[k++] = arr[j++];
        }

        while (i <= m)
            temp[k++] = arr[i++];

        while (j <= r)
            temp[k++] = arr[j++];

        for (int x = 0; x < temp.length; x++)
            arr[l + x] = temp[x];
    }

    // Main method
    public static void main(String[] args) {

        Sale[] sales = { new Sale(20240110, 500, "Branch A"), new Sale(20240109, 300, "Branch B"),new Sale(20240110, 500, "Branch C"),
            new Sale(20240108, 700, "Branch D") };

        mergeSort(sales, 0, sales.length - 1);

        System.out.println("daily sales summary report: ");
        for (Sale s : sales) {
            System.out.println("Date: " + s.date + ", Amount: " + s.amount +",Branch: " + s.branch);
        }
    }
}
