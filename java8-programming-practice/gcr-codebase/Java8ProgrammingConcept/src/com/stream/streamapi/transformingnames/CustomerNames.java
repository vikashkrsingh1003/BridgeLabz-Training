package com.stream.streamapi.transformingnames;

import java.util.List;

public class CustomerNames {

    public static void main(String[] args) {

        List<String> names = List.of(
                "saurav",
                "rahul",
                "neha",
                "anita",
                "vikas",
                "priya"
        );

        System.out.println(names.stream().map(n -> n.toUpperCase()).sorted().toList());

    }
}
