package com.annotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.annotation.allinjection.Animal;
import com.annotation.allinjection.ciConfig;

@SpringBootApplication
public class AnnotationBasedApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnnotationBasedApplication.class, args);
		
		
		ApplicationContext context =
                new AnnotationConfigApplicationContext(ciConfig.class);

        Animal animal = context.getBean(Animal.class);

        animal.display();
	}

}
