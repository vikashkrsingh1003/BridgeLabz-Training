package com.day01.ambulanceroute;

public class Node {
    String unitName;
    boolean available;
    Node next;

    Node(String unitName, boolean available) {
        this.unitName = unitName;
        this.available = available;
        this.next = null;
    }
}

