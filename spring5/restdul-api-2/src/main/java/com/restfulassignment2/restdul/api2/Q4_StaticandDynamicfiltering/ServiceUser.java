package com.restfulassignment2.restdul.api2.Q4_StaticandDynamicfiltering;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceUser {
    static List<User> users = new ArrayList<>();

    static{
        users.add(new User(1,"a","qwe"));
        users.add(new User(2,"b","qweewwd"));
        users.add(new User(3,"c","qw2343ree"));

    }

    public User addUser(User user){
        users.add(user);
        return user;
    }
}
