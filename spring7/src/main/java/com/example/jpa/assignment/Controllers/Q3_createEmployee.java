package com.example.jpa.assignment.Controllers;


import com.example.jpa.assignment.entities.Employee;
import com.example.jpa.assignment.repositories.EmployeeRepository;
import com.example.jpa.assignment.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users/")
public class Q3_createEmployee {

    @Autowired
    private EmployeeService empservice;

    @PostMapping("/create/")
    public Employee createEmployee(@RequestBody Employee emp){
        return empservice.createNewEmployeeData(emp);
    }


    @PostMapping("/createall/")
    public List<Employee> createAllEmployee(@RequestBody List<Employee> emp){
        return empservice.createNewultipleEmployeeData(emp);
    }
}
