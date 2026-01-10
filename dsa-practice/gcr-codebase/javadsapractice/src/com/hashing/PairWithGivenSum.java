package com.hashing;

import java.util.HashMap;
import java.util.Map;

public class PairWithGivenSum {

    public static boolean hasPair(int[] arr, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            int complement = target - num;

            if (map.containsKey(complement)) {
                System.out.println("Pair found: " + complement + " + " + num + " = " + target);
                return true;
            }

            map.put(num, 1); 
        }

        System.out.println("No pair found with sum " + target);
        return false;
    }

 
    public static void main(String[] args) {

        int[] arr = {8, 7, 2, 5, 3, 1};
        int target = 10;

        PairWithGivenSum.hasPair(arr, target);
    }
}
