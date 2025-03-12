package com.example.jpa.assignment.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import org.springframework.lang.NonNull;

@Entity
public class Employee {
    //Name, Id, Age, Location
    @Size(min=3)
    @NonNull
    private String name;
    @Id
    private long id;
    @Max(60)
    @Min(18)
    private int age;
    private String location;

    public Employee(){

    }

    public Employee(String name,long id,int age,String location){
        this.name=name;
        this.id=id;
        this.location=location;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
