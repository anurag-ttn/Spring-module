package com.restfulapi.restful_api_assignment.ccontrollers;


import com.restfulapi.restful_api_assignment.services.ManageEmp;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Q7_restAPI {


    @Autowired
    private ManageEmp empservice;

    @DeleteMapping(path = "/deleteemployee",params = {"id"})
    public String deleteUser(@PathParam("id") int id){
        return empservice.deleteEmployee(id);
    }
}
