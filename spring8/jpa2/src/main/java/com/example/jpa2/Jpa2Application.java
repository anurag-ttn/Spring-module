package com.example.jpa2;

import com.example.jpa2.services.EmployeeService;
import com.example.jpa2.services.PersonService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Jpa2Application {

	public static void main(String[] args) {
		ApplicationContext c = SpringApplication.run(Jpa2Application.class, args);
		EmployeeService es = c.getBean(EmployeeService.class);
		es.method();
		PersonService ps = c.getBean(PersonService.class);
		ps.method();
	}

}
