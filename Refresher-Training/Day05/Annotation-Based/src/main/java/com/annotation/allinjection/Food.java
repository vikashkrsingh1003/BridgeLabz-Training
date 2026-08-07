package com.annotation.allinjection;

import org.springframework.stereotype.Component;

@Component
public class Food {

    @Override
    public String toString() {
        return "Grass";
    }
}