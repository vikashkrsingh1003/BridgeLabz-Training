package com.collections.listinterface;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class ReverseList {
	public static void reverseArrayList(List<Integer> list) {
	
		int size = list.size();
		for(int i = 0; i<size/2; i++)
		{
			int temp = list.get(i);
			list.set(i,list.get(size - 1 - i));
			list.set(size-1-i,temp);
		}
	}

	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<>(List.of(1,2,3,4,5));
		List<Integer> list2 = new LinkedList<>(List.of(1,2,3,4,5));
		
		reverseArrayList(list1);
		System.out.println(list1);
		
		reverseArrayList(list2);
		System.out.println(list2);
	
	}
}