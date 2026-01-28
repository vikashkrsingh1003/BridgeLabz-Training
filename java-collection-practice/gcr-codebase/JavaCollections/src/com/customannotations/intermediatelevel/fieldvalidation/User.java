package com.customannotations.intermediatelevel.fieldvalidation;

import java.lang.reflect.Field;

public class User {

    @MaxLength(10)
    String username;

    User(String username) throws Exception {
        Field field = this.getClass().getDeclaredField("username");
        MaxLength ml = field.getAnnotation(MaxLength.class);

        if (username.length() > ml.value()) {
            throw new IllegalArgumentException("Username too long");
        }
        this.username = username;
    }
}