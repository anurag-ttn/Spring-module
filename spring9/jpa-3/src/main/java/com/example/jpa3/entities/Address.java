package com.example.jpa3.entities;

// Create a class Address for Author with instance variables streetNumber, location, State.

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {

    private String streetNumber;
    private String location;
    private String State;

    public Address(String streetNumber, String location, String state) {
        this.streetNumber = streetNumber;
        this.location = location;
        State = state;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getState() {
        return State;
    }

    public Address() {
    }

    public void setState(String state) {
        State = state;
    }
}
