package com.lambdaexpressions.shoppingecommercesystems;

@FunctionalInterface
public interface DeliveryCheck {
    boolean isFree(double amount);
}
