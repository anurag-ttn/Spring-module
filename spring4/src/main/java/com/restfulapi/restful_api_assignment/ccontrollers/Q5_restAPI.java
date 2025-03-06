package com.restfulapi.restful_api_assignment.ccontrollers;


import com.restfulapi.restful_api_assignment.Beans.Employee;
import com.restfulapi.restful_api_assignment.services.ManageEmp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Q5_restAPI {

    @Autowired
    private ManageEmp manageemp;

    @PostMapping("/addemployee")
    public Employee addEmployee(@RequestBody Employee emp){
        return manageemp.addNewEmployee(emp);
    }

}
