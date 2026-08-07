package com.javabased.constructorInjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class constructorInjectionConfig {

    @Bean
    public Food food() {
        return new Food("Grass");
    }

    @Bean
    public Animal animal() {
        return new Animal("Cow", food());
    }
}