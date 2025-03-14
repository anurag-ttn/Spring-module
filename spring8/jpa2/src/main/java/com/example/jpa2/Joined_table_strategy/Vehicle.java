package com.example.jpa2.Joined_table_strategy;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long regno;
    private String name;

    public long getRegno() {
        return regno;
    }

    public void setRegno(long regno) {
        this.regno = regno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
