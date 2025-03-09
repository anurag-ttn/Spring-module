package com.restfulassignment2.restdul.api2.Q1_Internationalization;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class LanguageController {

    @Autowired
    private MessageSource messageSource;

    @GetMapping("/home")
    public String getMessage(@RequestParam(required = false) String username, @RequestHeader (name = "Accept-Language", required = false) Locale locale){
            return ""+messageSource.getMessage("message",null,locale)+" "+username;
    }
}
