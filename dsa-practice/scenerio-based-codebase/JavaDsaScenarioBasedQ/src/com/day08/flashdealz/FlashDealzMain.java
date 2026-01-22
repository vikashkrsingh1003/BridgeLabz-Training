package com.day08.flashdealz;

public class FlashDealzMain {

    public static void main(String[] args) {

        DiscountSorter sorter = new DiscountSorter();

        int[] discounts = {45, 10, 70, 30, 90, 20, 60};

        sorter.quickSort(discounts, 0, discounts.length - 1);

        System.out.println("=== Top Discounts Sorted ===");
        for (int d : discounts) {
            System.out.println("Discount: " + d + "%");
        }
    }
}