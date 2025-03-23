package com.example.customspringsecurity.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public/")
public class PublicController {

    @GetMapping("/home")
    public String publicPAge(){
        return "This is publicly accessible page anyone without username and pass"+
                "word can access it";
    }
}
