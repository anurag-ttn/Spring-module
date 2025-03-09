package com.restfulassignment2.restdul.api2.Q2_ContentNegotiation;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControllerContentNeg {

    @Autowired
    private ServiceQ2 userservice;

    @GetMapping(value = "/cn/getuser",produces = "application/xml")
    public List<UsersQ2> getUser() {
        return userservice.getAllUsers();
    }

    @PostMapping(value = "/cn/adduser",produces = "application/xml")
    public UsersQ2 addUser(@RequestBody UsersQ2 user){
        return userservice.addMyUser(user);
    }


}
