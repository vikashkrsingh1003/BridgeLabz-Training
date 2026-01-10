package com.hashing;
import java.util.*;

public class SubarrayWithZero {
	
	    public static List<int[]> findZeroSumSubarrays(int[] arr) {
	        Map<Integer, List<Integer>> sumIndices = new HashMap<>();
	        List<int[]> result = new ArrayList<>();

	        int prefixSum = 0;

	       
	        sumIndices.put(0, new ArrayList<>(Arrays.asList(-1)));

	        for (int i = 0; i < arr.length; i++) {
	            prefixSum += arr[i];

	            if (sumIndices.containsKey(prefixSum)) {
	                for (int startIndex : sumIndices.get(prefixSum)) {
	                    result.add(new int[]{startIndex + 1, i});
	                }
	            }

	            sumIndices.computeIfAbsent(prefixSum, k -> new ArrayList<>()).add(i);
	        }

	        return result;
	    }

	    public static void main(String[] args) {
	        int[] arr = {3, 4, -7, 3, 1, 3, -4};

	        List<int[]> subarrays = findZeroSumSubarrays(arr);

	        for (int[] pair : subarrays)  { 
	        	System.out.println("Subarray found from index " + pair[0] + " to " + pair[1]);
	        }
	   }
  }


