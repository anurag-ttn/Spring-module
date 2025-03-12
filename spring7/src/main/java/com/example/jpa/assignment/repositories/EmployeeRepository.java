package com.example.jpa.assignment.repositories;

import com.example.jpa.assignment.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    List<Employee> findEmployeeByName(String name);

    List<Employee> findByNameStartsWith(char ch);

    List<Employee> findByAgeBetween(int a , int b);
}
