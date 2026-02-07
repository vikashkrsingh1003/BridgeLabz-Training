package com.lambdaexpressions.shoppingecommercesystems;

@FunctionalInterface
public interface DiscountCalculator {
    double apply(double price);
}
