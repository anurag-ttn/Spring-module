package com.restfulapi.restful_api_assignment.Beans;

import jakarta.validation.constraints.*;

public class Employee {
    private static int myid=0;
    private int id;
    @Size(min = 4)
    private String name;
    @Min(0)
    @Max(60)

    private int age;

    public Employee(){
        this.id=++myid;
    }
    public Employee( String name , int age){
        this.id=++myid;
        this.age=age;
        this.name=name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId(){return id;}
    public int getAge(){return age;}
    public String getName(){return name;}
}
