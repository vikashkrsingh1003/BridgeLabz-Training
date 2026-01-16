package com.day04.eventmanager;

import java.util.*;

public class EventManager {

    // Quick Sort method
    static void quickSort(int[] prices, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(prices, low, high);

            quickSort(prices, low, pivotIndex - 1);
            quickSort(prices, pivotIndex + 1, high);
        }
    }

    // Partition method
    static int partition(int[] prices, int low, int high) {
        int pivot = prices[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (prices[j] < pivot) {
                i++;
                int temp = prices[i];
                prices[i] = prices[j];
                prices[j] = temp;
            }
        }

        int temp = prices[i + 1];
        prices[i + 1] = prices[high];
        prices[high] = temp;

        return i + 1;
    }

    // Main method
    public static void main(String[] args) {

        int[] ticketPrices = {
            1200, 450, 800, 300, 1500,
            700, 200, 950, 400, 600
        };

        System.out.println("Unsorted Ticket Prices:");
        System.out.println(Arrays.toString(ticketPrices));
        System.out.println("-------------------------------");
        // Sort ticket prices
        quickSort(ticketPrices, 0, ticketPrices.length - 1);

        System.out.println("\nSorted Ticket Prices:");
        System.out.println(Arrays.toString(ticketPrices));
        System.out.println("-------------------------------");
        // Display cheapest tickets
        System.out.println("top 5 cheapest Tickets:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Rs: " + ticketPrices[i]);
        }
        System.out.println("-------------------------------");
        
        // Display expensive tickets
        System.out.println("top 5  expensive tickets:");
        for (int i = ticketPrices.length - 1; i >= ticketPrices.length - 5; i--) {
            System.out.println("Rs: " + ticketPrices[i]);
        }
    }
}

