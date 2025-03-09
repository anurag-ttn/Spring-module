package com.restfulassignment2.restdul.api2.Q2_ContentNegotiation;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceQ2 {


    private static List<UsersQ2> list = new ArrayList<>();
    static{
        list.add(new UsersQ2(1,"a"));
        list.add(new UsersQ2(2,"b"));
    }

    public List<UsersQ2> getAllUsers(){
        return list;
    }

    public UsersQ2 addMyUser(UsersQ2 user){
        list.add(user);
        return user;
    }

}
