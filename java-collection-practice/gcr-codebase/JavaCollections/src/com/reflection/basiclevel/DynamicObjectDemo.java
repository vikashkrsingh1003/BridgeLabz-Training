package com.reflection.basiclevel;

public class DynamicObjectDemo {
    public static void main(String[] args) throws Exception {
    	Class<?> cls =
    			Class.forName("com.reflection.basiclevel.Student");
        Object obj = cls.getDeclaredConstructor().newInstance();
    }
}