package com.example.customspringsecurity.controllers;

import com.example.customspringsecurity.entities.Customer;
import com.example.customspringsecurity.repos.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin/")
public class AdminOnly {

    @Autowired
    private CustomerRepo customerRepo;

    @GetMapping("/getusers")
    public List<Customer> getUsers(){
        return  customerRepo.findAll();
    }
}
