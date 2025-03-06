package com.restfulapi.restful_api_assignment.ccontrollers;


import com.restfulapi.restful_api_assignment.Beans.Employee;
import com.restfulapi.restful_api_assignment.services.ManageEmp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Q3_restAPI {

    @Autowired
    private ManageEmp empservice;

    @GetMapping("/all-employee")
    public List<Employee> getAllEmp(){
        return empservice.getAllEmployees();
    }
}
