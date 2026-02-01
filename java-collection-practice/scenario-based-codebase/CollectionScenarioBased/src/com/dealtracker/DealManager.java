package com.dealtracker;

import java.time.LocalDate;
import java.util.*;

public class DealManager {

    // Remove expired + duplicate deals
    public static Map<String, Deal> validDeals(List<Deal> deals) {

        Map<String, Deal> map = new HashMap<>();
        Set<String> seenCodes = new HashSet<>();

        for (Deal d : deals) {
            if (d.getValidTill().isAfter(LocalDate.now())
                    && seenCodes.add(d.getCode())) {

                map.put(d.getCode(), d);
            }
        }
        return map;
    }

    public static <T extends Deal>
    List<T> sortByDiscount(Collection<T> deals) {

        List<T> list = new ArrayList<>(deals);
        list.sort(Comparator.comparingInt(Deal::getDiscount).reversed());
        return list;
    }
}
