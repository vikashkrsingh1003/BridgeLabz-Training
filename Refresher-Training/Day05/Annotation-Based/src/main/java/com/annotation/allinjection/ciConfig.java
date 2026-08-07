package com.annotation.allinjection;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.annotation.constructorInjection")
public class ciConfig {
}