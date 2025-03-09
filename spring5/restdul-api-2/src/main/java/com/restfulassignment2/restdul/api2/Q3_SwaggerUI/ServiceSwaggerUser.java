package com.restfulassignment2.restdul.api2.Q3_SwaggerUI;

import com.restfulassignment2.restdul.api2.Q4_StaticandDynamicfiltering.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.List.*;
import java.util.ArrayList;

@Service
public class ServiceSwaggerUser {

    private static  List<UserSwagger> list = new ArrayList<>();
    static{
        list.add(new UserSwagger(1,"a","delhi"));
        list.add(new UserSwagger(2,"b","faridabad"));
    }

   public UserSwagger getUser(int id){
       for(UserSwagger u : list){
           if(u.getId()==id) return u;
       }
       return null;
   }

   public UserSwagger addMyUser(UserSwagger user){
        list.add(user);
        return user;
   }

   public boolean deleteUser(int id){
        return list.removeIf(user->user.getId()==id);
   }
}
