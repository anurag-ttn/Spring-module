package com.restfulassignment2.restdul.api2.Q6_HATEOAS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class HateosController {

    @Autowired
    private ServiceUserQ6 users;

    @GetMapping("/getall")
    public List<UserQ6> retrieveAll(){
        return users.returnAll();
    }

    @PostMapping("/addone")
    public EntityModel<UserQ6> addOneUser(@RequestBody UserQ6 usr){
        UserQ6 s = users.addUser(usr);
        EntityModel<UserQ6> model = EntityModel.of(s);
        WebMvcLinkBuilder link;
        link = linkTo(methodOn(this.getClass()).retrieveAll());
        model.add(link.withRel("allStudents"));
        return model;
    }
}
