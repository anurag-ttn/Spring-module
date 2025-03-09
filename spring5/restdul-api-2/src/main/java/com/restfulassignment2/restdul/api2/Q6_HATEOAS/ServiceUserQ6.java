package com.restfulassignment2.restdul.api2.Q6_HATEOAS;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceUserQ6 {
    static List<UserQ6> users = new ArrayList<>();

    static{
        users.add(new UserQ6(1,"a","qwe"));
        users.add(new UserQ6(2,"b","qweewwd"));
        users.add(new UserQ6(3,"c","qw2343ree"));

    }

    public UserQ6 addUser(UserQ6 user){
        users.add(user);
        return user;
    }

    public List<UserQ6> returnAll(){
        return users;
    }
}
