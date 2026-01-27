package com.jtest.main;

import java.util.List;

public class ListManager {

    public static void addElement(List<Integer> list, int element) {
        if (list != null) {
            list.add(element);
        }
    }

    public static void removeElement(List<Integer> list, int element) {
        if (list != null) {
            list.remove(Integer.valueOf(element)); // remove by value, not index
        }
    }

    public static int getSize(List<Integer> list) {
        if (list == null) return 0;
        return list.size();
    }
}
