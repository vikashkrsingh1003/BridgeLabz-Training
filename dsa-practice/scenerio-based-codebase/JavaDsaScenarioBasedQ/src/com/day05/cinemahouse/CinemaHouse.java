package com.day05.cinemahouse;

import java.util.Arrays;

public class CinemaHouse {

    // Bubble Sort
    static void bubbleSort(int[] showTimes) {
        int n = showTimes.length;
        for (int i = 0; i < n - 1; i++) {        	
           
            for (int j = 0; j < n - i - 1; j++) {
                if (showTimes[j] > showTimes[j + 1]) {
                	
                    // Swap adjacent elements
                    int temp = showTimes[j];
                    showTimes[j] = showTimes[j + 1];
                    showTimes[j + 1] = temp;
                   
                }
            }
        }
    }

    // Main method
    public static void main(String[] args) {
    	
        int[] dailyShowTimes = {18, 12, 15, 20, 10, 22};

        System.out.println("showtimes before sorting:");
        System.out.println(Arrays.toString(dailyShowTimes));

        bubbleSort(dailyShowTimes);

        System.out.println("\nshowtimes after sorting:");
        System.out.println(Arrays.toString(dailyShowTimes));
    }
}

