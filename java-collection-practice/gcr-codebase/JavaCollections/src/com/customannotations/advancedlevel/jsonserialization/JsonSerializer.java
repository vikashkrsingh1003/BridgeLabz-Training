package com.customannotations.advancedlevel.jsonserialization;

import java.lang.reflect.Field;

public class JsonSerializer {
    public static String toJson(Object obj) throws Exception {
        StringBuilder sb = new StringBuilder("{");

        for (Field f : obj.getClass().getDeclaredFields()) {
            if (f.isAnnotationPresent(JsonField.class)) {
                JsonField jf = f.getAnnotation(JsonField.class);
                f.setAccessible(true);
                sb.append("\"").append(jf.name()).append("\":\"")
                  .append(f.get(obj)).append("\",");
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append("}");
        return sb.toString();
    }
}