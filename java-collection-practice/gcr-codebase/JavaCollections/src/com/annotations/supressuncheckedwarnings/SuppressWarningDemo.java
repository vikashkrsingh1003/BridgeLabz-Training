package com.annotations.supressuncheckedwarnings;

import java.util.ArrayList;

public class SuppressWarningDemo {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList list = new ArrayList(); // raw type
        list.add("Java");
        list.add(100);

        System.out.println(list);
    }
}