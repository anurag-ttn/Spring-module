package com.restfulassignment2.restdul.api2.Q4_StaticandDynamicfiltering;


import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private ServiceUser serviceuser;

    @PostMapping("/static/add")
    public User addUserStaticFiltering(@Valid @RequestBody User user){
        return serviceuser.addUser(user);
    }

    @PostMapping("/dynamic/add")
    public MappingJacksonValue addUserDynamicFiltering(@Valid @RequestBody User user){
        User user1 =  serviceuser.addUser(user);
        MappingJacksonValue jksnvlue = new MappingJacksonValue(user1);
        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("id","name");
        SimpleFilterProvider provider = new SimpleFilterProvider().addFilter("user-class",filter);
        jksnvlue.setFilters(provider);

        return jksnvlue;
    }
}
