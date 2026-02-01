package com.dealtracker;

import java.io.*;
import java.time.*;
import java.time.format.*;
import java.util.*;
import java.util.regex.*;

public class DealReader {

    private static final Pattern CODE =
            Pattern.compile("DealCode:\\s*(\\w+)");
    private static final Pattern DATE =
            Pattern.compile("ValidTill:\\s*(\\d{2}-\\d{2}-\\d{4})");
    private static final Pattern DISCOUNT =
            Pattern.compile("Discount:\\s*(\\d+)%");
    private static final Pattern MIN =
            Pattern.compile("MinimumPurchase:\\s*(\\d+)");

    public static List<Deal> read(String fileName) throws Exception {

        InputStream is = DealReader.class
                .getClassLoader()
                .getResourceAsStream(fileName);

        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        List<Deal> deals = new ArrayList<>();

        String line;
        String code = null;
        LocalDate date = null;
        int discount = 0;
        int min = 0;

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        while ((line = br.readLine()) != null) {

            Matcher m;
            if ((m = CODE.matcher(line)).find())
                code = m.group(1);

            else if ((m = DATE.matcher(line)).find())
                date = LocalDate.parse(m.group(1), fmt);

            else if ((m = DISCOUNT.matcher(line)).find())
                discount = Integer.parseInt(m.group(1));

            else if ((m = MIN.matcher(line)).find()) {
                min = Integer.parseInt(m.group(1));
                deals.add(new Deal(code, date, discount, min));
            }
        }
        return deals;
    }
}
