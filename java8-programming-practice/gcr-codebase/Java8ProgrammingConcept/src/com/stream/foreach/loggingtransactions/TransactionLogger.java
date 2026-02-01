package com.stream.foreach.loggingtransactions;

import java.time.LocalDateTime;
import java.util.List;

public class TransactionLogger {

    public static void main(String[] args) {

        List<String> transactionIds = List.of(
                 "TXN101",
                 "TXN102",
                 "TXN103",
                 "TXN104",
                 "TXN105"
         );

       transactionIds.forEach(id -> System.out.println(LocalDateTime.now() + " : " + id));

    }
}

