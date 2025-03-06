package com.restfulapi.restful_api_assignment.ccontrollers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Q1_restAPI {

    @RequestMapping(method = RequestMethod.GET,path = "/")
    public String homePage(){
        return "Welcome to Spring boot";
    }
}
