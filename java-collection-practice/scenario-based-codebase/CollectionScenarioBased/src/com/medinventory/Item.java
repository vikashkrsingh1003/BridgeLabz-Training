package com.medinventory;

import java.util.*;

public class Item<T> {
    String id;
    T name;
    int quantity;
    String expiry;

    public Item(String id, T name, int quantity, String expiry) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.expiry = expiry;
    }

    public boolean equals(Object o) {
        if (!(o instanceof Item)) return false;
        return id.equals(((Item<?>) o).id);
    }

    public int hashCode() {
        return id.hashCode();
    }
}

