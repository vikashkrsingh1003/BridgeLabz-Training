package com.customannotations.advancedlevel.customcaching;

import java.util.HashMap;
import java.util.Map;

public class Calculator {

    private static Map<Integer, Integer> cache = new HashMap<>();

    @CacheResult
    int square(int n) {
        if (cache.containsKey(n)) {
            return cache.get(n);
        }
        int result = n * n;
        cache.put(n, result);
        return result;
    }
}