package com.restfulapi.restful_api_assignment.ccontrollers;


import com.restfulapi.restful_api_assignment.Beans.Employee;
import com.restfulapi.restful_api_assignment.services.ManageEmp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Q4_restAPI {

    @Autowired
    private ManageEmp empservice;

    @GetMapping("/get-top-emp/{top}")
    public String getTopEmployee(@PathVariable String top){
        return  top;
//        return empservice.getOneEmp();
    }
}
