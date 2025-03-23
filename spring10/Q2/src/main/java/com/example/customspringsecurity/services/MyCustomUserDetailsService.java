package com.example.customspringsecurity.services;

import com.example.customspringsecurity.entities.Customer;
import com.example.customspringsecurity.repos.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyCustomUserDetailsService implements UserDetailsService {
    @Autowired
    private CustomerRepo customerRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Customer customer = customerRepo.findByUsername(username);
        if (customer==null) throw new UsernameNotFoundException("Customer not found");

        return User.withUsername(customer.getUsername())
                .password(customer.getPassword())
                .roles(customer.getRole())
                .build();
    }
}
