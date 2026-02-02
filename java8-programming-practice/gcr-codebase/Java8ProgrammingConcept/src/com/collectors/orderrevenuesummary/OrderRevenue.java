package com.collectors.orderrevenuesummary;

import java.util.*;
import java.util.stream.Collectors;

public class OrderRevenue {
    public static void main(String[] args) {

        List<Order> orders = Arrays.asList(
                new Order("Ram", 500),
                new Order("Amit", 300),
                new Order("Ram", 700)
        );

        Map<String, Double> revenuePerCustomer =
                orders.stream()
                        .collect(Collectors.groupingBy(
                                Order::getCustomer,
                                Collectors.summingDouble(Order::getAmount)
                        ));

        System.out.println(revenuePerCustomer);
    }
}
