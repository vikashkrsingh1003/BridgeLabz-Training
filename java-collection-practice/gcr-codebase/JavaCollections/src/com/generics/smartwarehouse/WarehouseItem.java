package com.generics.smartwarehouse;

public abstract class WarehouseItem {

	private String name;
	
	public WarehouseItem(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public abstract String getCategory();
}
