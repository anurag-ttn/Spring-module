package com.example.springfraework1.spring.one;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

/*
Q5-
Abmibuity arised in application when @Autowired annotation can not resolve which bean to call
because each of them if of equal priority
We can resolve it by using @Primary annotation for one of the beans which we want to give priority
other we can use @Qualifier annotation on the for the bean we have to use

Q6 -
use @Autowird on constructor thus the bean would be initialised by preferred bean having @Primary annotation
 */

@SpringBootApplication
public class SpringOneApplication {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.example.springfraework1.spring.one");
		BinarySearch bs = context.getBean(BinarySearch.class);
		System.out.println(bs.search(new int[]{1,2,3,4,5,6,7,8,9}));
	}

}
