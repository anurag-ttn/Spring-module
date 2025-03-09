package com.restfulassignment2.restdul.api2.Q5_VersioningRestfulAPIs;

public class Name {

    private String firstName;
    private String secondName;

    public Name(String f , String s){
        firstName=f;
        secondName=s;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
}
