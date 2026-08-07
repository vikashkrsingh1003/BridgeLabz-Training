package com.javabased.feildInjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Address address() {
        return new Address();
    }

    @Bean
    public Student student() {
        return new Student();
    }
}