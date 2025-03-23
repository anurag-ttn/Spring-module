package com.example.customspringsecurity;

import com.example.customspringsecurity.entities.Customer;
import com.example.customspringsecurity.repos.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.List;

@SpringBootApplication
public class CustomspringsecurityApplication implements CommandLineRunner {

	@Autowired
	private CustomerRepo customerRepo;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(CustomspringsecurityApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Customer c1 = new Customer();
		Customer c2 = new Customer();

		c1.setUsername("a1");c1.setAddress("abc");
		c1.setPassword(bCryptPasswordEncoder.encode("1234"));c1.setRole("USER");
		c2.setUsername("a2");c2.setAddress("xyz");
		c2.setPassword(bCryptPasswordEncoder.encode("12341234"));c2.setRole("ADMIN");


		customerRepo.saveAllAndFlush(List.of(c1,c2));
	}
}
