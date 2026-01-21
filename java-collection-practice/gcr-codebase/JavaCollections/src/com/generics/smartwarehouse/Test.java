package com.generics.smartwarehouse;

public class Test {

	public static void main(String[] args) {
		
		    Storage<Electronics> electronicsStorage = new Storage<>();
	        Storage<Groceries> groceryStorage = new Storage<>();
	        Storage<Furniture> furnitureStorage = new Storage<>();

	        electronicsStorage.addItem(new Electronics("Laptop"));
	        electronicsStorage.addItem(new Electronics("Mobile"));

	        groceryStorage.addItem(new Groceries("Rice"));
	        groceryStorage.addItem(new Groceries("Milk"));

	        furnitureStorage.addItem(new Furniture("Table"));
	        furnitureStorage.addItem(new Furniture("Chair"));

	        WarehouseUtils.displayItems(electronicsStorage.getItems());
	        WarehouseUtils.displayItems(groceryStorage.getItems());
	        WarehouseUtils.displayItems(furnitureStorage.getItems());
	}
}
