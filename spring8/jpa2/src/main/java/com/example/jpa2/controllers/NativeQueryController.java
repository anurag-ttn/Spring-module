package com.example.jpa2.controllers;


import com.example.jpa2.entities.Employee;
import com.example.jpa2.services.EmployeeService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class NativeQueryController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/getallwith/{lastname}")
    public List<Object[]> getAllWithLastName(@PathVariable("lastname") String lastname){
        return employeeService.findWithLastName(lastname);
    }

    @DeleteMapping("/deletegreaterthan")
    public int deleteAgeGreaterTHan(@PathParam("age") int age){
        return employeeService.deleteWithAgegreater(age);
    }

}
