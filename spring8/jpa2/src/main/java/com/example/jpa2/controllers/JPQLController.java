package com.example.jpa2.controllers;

import com.example.jpa2.entities.Employee;
import com.example.jpa2.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JPQLController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("allemp")
    public List<Object[]> getAllEmployee(){
        return employeeService.getAllEmployeeNamesBasedOnAgeAndSalary();
    }

    @PostMapping("/update/{minsalary}")
    public void updateSalaryWith(@PathVariable("minsalary") long minimumsalary){
        employeeService.updateSalary(minimumsalary);
    }

    @DeleteMapping("deleteemp/minsalary")
    public int deleteEmployees(){
        return employeeService.deleteEmployeeMinSal();
    }
}
