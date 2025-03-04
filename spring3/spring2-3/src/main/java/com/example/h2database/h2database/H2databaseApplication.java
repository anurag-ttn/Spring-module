package com.example.h2database.h2database;

import com.example.h2database.h2database.entity.Employee;
import com.example.h2database.h2database.services.ManageEmployee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class H2databaseApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(H2databaseApplication.class, args);
		ManageEmployee me = context.getBean(ManageEmployee.class);
		me.saveInTable(new Employee(1,"Anurag","Java Developer Trainee"));
		me.saveInTable(new Employee(2,"Ayan","Java Developer Trainee"));
		me.saveInTable(new Employee(4,"Anurag2","Java Developer Trainee"));
		me.saveInTable(new Employee(1,"Ayan2","Java Developer Trainee"));

	}

}
