package com.collections.listinterface;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class FindFrequency {

	public static HashMap<String,Integer> findsFrequency(List<String> list){
		HashMap<String,Integer> result = new HashMap<>();
		
		for(String f : list)
		{
			if(result.containsKey(f))
			    result.put(f, result.get(f) + 1);
			else
				result.put(f, 1);
		}
		
		return result;
	}
	public static void main(String[] args) {

		List<String> fruits = new ArrayList<>(List.of("apple","banana","apple","orange"));
		
		HashMap<String, Integer> result = findsFrequency(fruits);
		System.out.println(result);
		
	}

}