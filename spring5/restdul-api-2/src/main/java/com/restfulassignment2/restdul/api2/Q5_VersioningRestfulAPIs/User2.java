package com.restfulassignment2.restdul.api2.Q5_VersioningRestfulAPIs;

public class User2 {

    private Name name;
    private int id;

    public User2( int id,Name name) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }
}
