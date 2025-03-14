package com.example.jpa2.Joined_table_strategy;

import jakarta.persistence.Entity;

@Entity
public class Bike extends  Vehicle{

    private String feature;

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }
}
