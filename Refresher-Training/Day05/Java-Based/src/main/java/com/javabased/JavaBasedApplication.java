package com.javabased;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
//import com.javabased.feildInjection.AppConfig;
//import com.javabased.feildInjection.Student;

import com.javabased.constructorInjection.Animal;
import com.javabased.constructorInjection.constructorInjectionConfig;
import com.javabased.setterInjection.SetterInjectionConfig;
import com.javabased.setterInjection.Vehicle;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaBasedApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaBasedApplication.class, args);
		
		
		// ApplicationContext context =
	              //  new AnnotationConfigApplicationContext(SetterInjectionConfig.class);

	       // Student student = context.getBean(Student.class);
	       // student.display();
		 
		 
//		 Vehicle vehicle = context.getBean(Vehicle.class);
//
//	        vehicle.display();
		
		
		
		ApplicationContext context =
                new AnnotationConfigApplicationContext(constructorInjectionConfig.class);

        Animal animal = context.getBean(Animal.class);

        animal.display();
	}

}
