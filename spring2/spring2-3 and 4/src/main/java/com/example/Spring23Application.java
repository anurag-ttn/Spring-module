package com.example;

/*
Q3-
Used @Component so that it can be used as bean and spring container can find it and use later as a bean to inject
 automatically
 and @Autowired so that spring container find it and inject dependency automatically after creating it.

 Q4.
 created a object of class AnnotationconfigApplicationContext to get get the context of inversion of control
 which takes care , created and manages all the beans whose method getBean is used to get the bean named
 Student from it and use it to display and set its properties.

 */
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Spring23Application {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.example");
		Student s = context.getBean(Student.class);
		s.setSid(1);
		s.setName("Anurag kundu");
		s.setAddress("faridabad");
		//getting properties of student by fetching it from bean
		System.out.println(s.getAddress());
		System.out.println(s.getSid());
		System.out.println(s.getName());
		System.out.println(s.getTeacher());
	}

}
