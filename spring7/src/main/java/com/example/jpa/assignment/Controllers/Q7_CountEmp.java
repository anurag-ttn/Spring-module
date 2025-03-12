package com.example.jpa.assignment.Controllers;


import com.example.jpa.assignment.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users/")
public class Q7_CountEmp {

    @Autowired
    private EmployeeService empser;

    @GetMapping("/total-emp")
    public long totalNoOfEmp(){
        return empser.countemp();
    }
}
