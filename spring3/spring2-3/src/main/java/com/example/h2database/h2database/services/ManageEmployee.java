package com.example.h2database.h2database.services;

import com.example.h2database.h2database.entity.Employee;
import com.example.h2database.h2database.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManageEmployee {

    @Autowired
    private EmployeeRepo empr;

    public Employee saveInTable(Employee emp){
        return empr.save(emp);
    }
}
