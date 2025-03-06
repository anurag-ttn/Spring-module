package com.restfulapi.restful_api_assignment.ccontrollers;

import com.restfulapi.restful_api_assignment.Beans.Employee;
import com.restfulapi.restful_api_assignment.services.ManageEmp;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Q9_restAPI {

    @Autowired
    private ManageEmp employee;

    @PostMapping("add-newEmployee")
    public Employee addEmployeeWithValidation(@Valid @RequestBody Employee emp){
        return employee.addNewEmployee(emp);
    }
}
