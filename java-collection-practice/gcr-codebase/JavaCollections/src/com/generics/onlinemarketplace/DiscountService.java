package com.generics.onlinemarketplace;

public class DiscountService {

	 public static <T extends Product<?>> void applyDiscount(T product, double percentage) {

	        double discountedPrice =
	                product.getPrice() - (product.getPrice() * percentage / 100);

	        if (product.getCategory().isValidPrice(discountedPrice)) {
	            product.setPrice(discountedPrice);
	        } else {
	            System.out.println("Discount not allowed for category");
	        }
	    }
}
