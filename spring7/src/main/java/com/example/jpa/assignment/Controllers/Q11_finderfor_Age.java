package com.example.jpa.assignment.Controllers;


import com.example.jpa.assignment.entities.Employee;
import com.example.jpa.assignment.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users/")
public class Q11_finderfor_Age {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/findbyage")
    public List<Employee> getEmpWithA(){
        return employeeService.getEmpAgeBetween(28,32);
    }


}
