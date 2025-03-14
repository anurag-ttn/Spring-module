package com.example.jpa2.table_per_class;

import jakarta.persistence.Entity;

@Entity
public class Child1 extends Parent{

    private String field1;

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }
}
