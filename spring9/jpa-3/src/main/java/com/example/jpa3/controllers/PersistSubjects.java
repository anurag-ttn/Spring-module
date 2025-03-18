package com.example.jpa3.controllers;


import com.example.jpa3.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class PersistSubjects {

    @Autowired
    private AuthorService authorService;

    @PostMapping("/create")
    public void createAuthorAndSubjects(){
        authorService.saveAuthorSubjects();
    }
}
