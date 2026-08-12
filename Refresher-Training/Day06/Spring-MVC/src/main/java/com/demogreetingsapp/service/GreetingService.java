package com.demogreetingsapp.service;

import java.util.List;

import com.demogreetingsapp.model.Greeting;

public interface GreetingService {

    Greeting saveGreeting(Greeting greeting);

    List<Greeting> getAllGreetings();

    Greeting getGreetingById(Long id);

    void deleteGreeting(Long id);

}