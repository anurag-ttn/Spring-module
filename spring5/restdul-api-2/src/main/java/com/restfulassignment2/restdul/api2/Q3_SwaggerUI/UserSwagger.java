package com.restfulassignment2.restdul.api2.Q3_SwaggerUI;

public class UserSwagger {
    private int id;
    private String name;
    private String address;

    public int getId() {
        return id;
    }

    public UserSwagger(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "UserSwagger{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
