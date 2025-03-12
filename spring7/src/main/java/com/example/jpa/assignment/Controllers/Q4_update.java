package com.example.jpa.assignment.Controllers;

import com.example.jpa.assignment.entities.Employee;
import com.example.jpa.assignment.services.EmployeeService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users/")
public class Q4_update {

    @Autowired
    EmployeeService employeeService;

    @PutMapping("/update")
    public Employee getEmpWithA(@PathParam("id") int id , @PathParam("location") String location){
        return employeeService.updateEmp(id,location);
    }


}
