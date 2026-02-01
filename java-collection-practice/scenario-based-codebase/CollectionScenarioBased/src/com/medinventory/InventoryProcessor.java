package com.medinventory;

import java.util.*;
import java.time.*;
import java.time.format.*;

public class InventoryProcessor {

    public static Map<String,List<Item<String>>> categorize(Set<Item<String>> items) {

        Map<String,List<Item<String>>> map = new HashMap<>();

        for (Item<String> i : items) {
            map.computeIfAbsent(i.name.toString(), k -> new ArrayList<>()).add(i);
        }

        return map;
    }

    public static void checkCritical(Set<Item<String>> items) throws LowStockException {

        for (Item<String> i : items)
            if (i.quantity < 5)
                throw new LowStockException("Critical low stock: " + i.id);
    }

    public static List<Item<String>> expired(Set<Item<String>> items) {

        List<Item<String>> list = new ArrayList<>();
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        for (Item<String> i : items) {
            LocalDate d = LocalDate.parse(i.expiry, f);
            if (d.isBefore(LocalDate.now()))
                list.add(i);
        }

        return list;
    }
}

