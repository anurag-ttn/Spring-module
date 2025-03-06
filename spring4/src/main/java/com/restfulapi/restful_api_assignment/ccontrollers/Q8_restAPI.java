package com.restfulapi.restful_api_assignment.ccontrollers;


import com.restfulapi.restful_api_assignment.Beans.Employee;
import com.restfulapi.restful_api_assignment.exceptions.EmpNotFoundException;
import com.restfulapi.restful_api_assignment.services.ManageEmp;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Q8_restAPI {

    @Autowired
    private ManageEmp emp;

    @GetMapping(path = "/update/employee",params = {"id","name","age"})
    public Employee updateEmployee(@PathParam("id") int id,
                                   @PathParam("age") int age,
                                   @PathParam("name")String name)
    {
        Employee e = emp.updateEmployee(id,name,age);
        if(e==null) throw new EmpNotFoundException("Employee with id :"+id+" is not found thus could not be updated!");
        return e;

    }
}
