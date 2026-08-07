package com.javabased.setterInjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SetterInjectionConfig {

	 @Bean
	    public Engine engine() {
	        return new Engine("Petrol");
	    }

	    @Bean
	    public Vehicle vehicle() {

	        Vehicle vehicle = new Vehicle();

	        vehicle.setName("Car");
	        vehicle.setEngine(engine());   // Setter Injection

	        return vehicle;
	    
	    }
	}