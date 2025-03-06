package com.restfulapi.restful_api_assignment.ccontrollers;


import com.restfulapi.restful_api_assignment.Beans.Employee;
import com.restfulapi.restful_api_assignment.exceptions.EmpNotFoundException;
import com.restfulapi.restful_api_assignment.services.ManageEmp;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Q6_restAPI {

    @Autowired
    private ManageEmp emp;

    @GetMapping(path="/getuser",params= {"id"})
    public Employee getUserById(@PathParam("id") int id){
        Employee employee = emp.getEmployeeById(id);
        if(employee==null){
            throw new EmpNotFoundException("Employee with this id :"+id+" is not found!");
        }
        return employee;
    }
}
