package com.demogreetingsapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demogreetingsapp.model.Greeting;

public interface GreetingRepository
        extends JpaRepository<Greeting, Long> {

}