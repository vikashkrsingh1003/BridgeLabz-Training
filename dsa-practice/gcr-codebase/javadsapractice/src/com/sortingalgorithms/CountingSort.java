package com.sortingalgorithms;

public class CountingSort {
	public static void main(String[] args) {
		
		int[] ages = {12, 15, 10, 14, 18, 13, 15, 11, 16};
        int min = 10;
        int max = 18;

        int[] count = new int[max - min + 1];
        int[] output = new int[ages.length];

        for (int age : ages) {
            count[age - min]++;
        }
        
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        for (int i = ages.length - 1; i >= 0; i--) {
            output[count[ages[i] - min] - 1] = ages[i];
            count[ages[i] - min]--;
        }

        for (int age : output) {
            System.out.print(age + " ");
        }

	}

}
