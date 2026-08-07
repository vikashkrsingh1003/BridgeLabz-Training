package com.springcore;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import com.springcore.ciexample.Student;
import com.springcore.setterInjection.Student;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreApplication.class, args);
		
		
		ApplicationContext context =
			    new ClassPathXmlApplicationContext("si.xml");

        Student student =
                context.getBean("student", Student.class);

        student.display();;
	}

}
