package com.reflection.intermediatelevel;

import java.lang.reflect.Field;

public class StaticFieldDemo {
    public static void main(String[] args) throws Exception {
        Field field = Configuration.class.getDeclaredField("API_KEY");
        field.setAccessible(true);

        field.set(null, "NEW_SECRET_KEY"); // null for static
        System.out.println(field.get(null));
    }
}