package com.lambdaexpressions.invoice;

import java.util.*;

public class InvoiceApp {

    public static void main(String[] args) {

        List<Integer> transactionIds = Arrays.asList(1001, 1002, 1003);

        // Constructor reference used here
        List<Invoice> invoices = transactionIds.stream().map(Invoice::new).toList();  

        invoices.forEach(System.out::println);
    }
}
