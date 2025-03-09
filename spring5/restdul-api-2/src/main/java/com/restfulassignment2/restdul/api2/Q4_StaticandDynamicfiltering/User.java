package com.restfulassignment2.restdul.api2.Q4_StaticandDynamicfiltering;

import com.fasterxml.jackson.annotation.JsonFilter;
import jakarta.validation.constraints.Size;
import org.springframework.lang.NonNull;

//@JsonIgnoreProperties("password")
@JsonFilter("user-class")
public class User {

    private int id;
    @NonNull
    @Size(min = 3)
    private String name;
    @NonNull
    @Size(min = 8)
    private String password;

    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User(int id , String name , String password) {
        this.password = password;
        this.name = name;
        this.id = id;
    }
}
