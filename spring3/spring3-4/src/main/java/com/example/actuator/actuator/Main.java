package com.example.actuator.actuator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Main {
    @RequestMapping("/")
    public String getData(){
        return "testing actuator in app";
    }
}
