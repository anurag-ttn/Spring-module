package com.example.jpa2.Joined_table_strategy;

import jakarta.persistence.Entity;

@Entity
public class Car extends Vehicle{

    private String modelno;
    private String manufacturer;

    public String getSeats() {
        return manufacturer;
    }

    public void setSeats(String manufacturer){
        this.manufacturer = manufacturer;
    }

    public String getModelno() {
        return modelno;
    }

    public void setModelno(String modelno) {
        this.modelno = modelno;
    }
}
