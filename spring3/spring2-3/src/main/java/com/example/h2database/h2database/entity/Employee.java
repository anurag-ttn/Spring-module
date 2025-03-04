package com.example.h2database.h2database.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {

    @Id
    private int id;
    private  String name;
    private String designation;

    public Employee(){}
    public Employee(int id , String name , String des){
        this.id=id;
        this.designation=des;
        this.name=name;
    }
}
