package com.methodreference.invokeobjectcreation;

import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<Integer> txIds = List.of(101, 102, 103);
		
		List<Invoice> invoices = txIds.stream()
                .map(Invoice::new)  
                .toList();
	}

}
