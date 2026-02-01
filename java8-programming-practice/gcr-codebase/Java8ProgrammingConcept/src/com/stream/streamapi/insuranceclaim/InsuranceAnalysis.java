package com.stream.streamapi.insuranceclaim;

import java.util.*;
import java.util.stream.Collectors;

public class InsuranceAnalysis {

    public static void main(String[] args) {

        List<Claim> claims = List.of(
                new Claim("Health", 12000),
                new Claim("Vehicle", 8000),
                new Claim("Health", 18000),
                new Claim("Life", 25000),
                new Claim("Vehicle", 10000),
                new Claim("Health", 15000)
        );

        Map<String, Double> avgClaimByType =
                claims.stream()
                      .collect(Collectors.groupingBy(
                              Claim::getType,
                              Collectors.averagingDouble(Claim::getAmount)
                      ));

        avgClaimByType.forEach((type, avg) ->
                System.out.println(type + " : " + avg)
        );
    }
}

