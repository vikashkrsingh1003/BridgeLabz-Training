package com.stream.foreach.stockpricelogger;

import java.util.List;

public class StockPriceLogger {

    public static void main(String[] args) {

        List<Double> stockPrices = List.of(
                245.50, 247.10, 243.90, 250.00, 248.75, 252.30
        );

       stockPrices.forEach(System.out::println);

    }
}

