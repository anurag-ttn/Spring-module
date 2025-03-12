package com.example.jpa.assignment.Controllers;

import com.example.jpa.assignment.entities.Employee;
import com.example.jpa.assignment.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class Q5_deleteEmp {

    @Autowired
    private EmployeeService empservice;


    @DeleteMapping("/deleteone")
    public Employee deleteOne(@RequestParam int id){
           return  empservice.deleteOne(id);
    }
}
