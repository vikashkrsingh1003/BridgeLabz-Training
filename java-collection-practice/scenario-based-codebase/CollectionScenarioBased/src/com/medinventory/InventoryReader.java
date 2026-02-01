package com.medinventory;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class InventoryReader {

    static Pattern date = Pattern.compile("\\d{2}-\\d{2}-\\d{4}");

    public static Set<Item<String>> read(String file) throws Exception {

        Set<Item<String>> set = new HashSet<>();
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;

        while ((line = br.readLine()) != null) {
            String[] p = line.split(",");
            if (p.length != 4) continue;
            if (!date.matcher(p[3]).matches()) continue;

            set.add(new Item<>(p[0], p[1], Integer.parseInt(p[2]), p[3]));
        }

        br.close();
        return set;
    }
}

