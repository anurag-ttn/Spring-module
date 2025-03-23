package com.example.customspringsecurity.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/")
public class AuthenticatedUser {

    @GetMapping("/page")
    public String allUsers(){
        return "Can be accessed by admin and all users";
    }
}
