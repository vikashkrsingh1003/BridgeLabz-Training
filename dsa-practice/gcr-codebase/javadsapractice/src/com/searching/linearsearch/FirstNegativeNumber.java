package com.searching.linearsearch;

public class FirstNegativeNumber {
	

  public static int findIndex(int arr[]) {
	  
		for(int i=0; i<arr.length;i++) {
			if(arr[i]<0) {
			    return i;     
			}
			
		}
		return -1;
		       

  }
   
	public static void main(String args[]) {
	int arr[] = {12,3,4,-3};
	
	System.out.println("first nagetive index is: "+ findIndex(arr));
	
	}
	
}
