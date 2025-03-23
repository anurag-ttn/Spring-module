package com.example.customspringsecurity.repos;

import com.example.customspringsecurity.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo  extends JpaRepository<Customer,Integer> {
    Customer findByUsername(String username);
}
