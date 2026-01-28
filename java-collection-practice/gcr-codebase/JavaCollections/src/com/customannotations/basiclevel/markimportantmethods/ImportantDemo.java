package com.customannotations.basiclevel.markimportantmethods;

import java.lang.reflect.Method;

public class ImportantDemo {
    public static void main(String[] args) {
        for (Method m : Service.class.getDeclaredMethods()) {
            if (m.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod im =
                        m.getAnnotation(ImportantMethod.class);
                System.out.println(m.getName() + " -> " + im.level());
            }
        }
    }
}