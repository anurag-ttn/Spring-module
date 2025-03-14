package com.example.jpa2.table_per_class;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Parent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long aadharno;
    private int weight;
    private String name;

    public long getAadharno() {
        return aadharno;
    }

    public void setAadharno(long aadharno) {
        this.aadharno = aadharno;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
