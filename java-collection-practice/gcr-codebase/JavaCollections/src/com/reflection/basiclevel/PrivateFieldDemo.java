package com.reflection.basiclevel;

import java.lang.reflect.Field;

public class PrivateFieldDemo {
    public static void main(String[] args) throws Exception {
        Person p = new Person();

        Field field = Person.class.getDeclaredField("age");
        field.setAccessible(true); // bypass private access

        field.set(p, 30); // modify value
        System.out.println("Age: " + field.get(p));
    }
}