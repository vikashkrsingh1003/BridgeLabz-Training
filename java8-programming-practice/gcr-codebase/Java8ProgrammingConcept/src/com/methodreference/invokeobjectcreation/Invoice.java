package com.methodreference.invokeobjectcreation;

public class Invoice {

	int id;
	
	Invoice(int id){
		this.id = id;
		System.out.println("Invoice generated with Id " + id);
	}
}
