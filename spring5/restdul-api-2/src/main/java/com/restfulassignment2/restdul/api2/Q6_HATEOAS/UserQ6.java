package com.restfulassignment2.restdul.api2.Q6_HATEOAS;

public class UserQ6 {

    private int id;
    private String name;
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

    public UserQ6(int id , String name , String password) {
        this.password = password;
        this.name = name;
        this.id = id;
    }
}
