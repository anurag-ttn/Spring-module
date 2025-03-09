package com.restfulassignment2.restdul.api2.Q2_ContentNegotiation;

public class UsersQ2 {
    private int id;
    private String name;

    public UsersQ2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
