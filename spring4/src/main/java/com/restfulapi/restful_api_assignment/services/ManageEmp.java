package com.restfulapi.restful_api_assignment.services;

import com.restfulapi.restful_api_assignment.Beans.Employee;
import com.restfulapi.restful_api_assignment.exceptions.EmpNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ManageEmp {
    static List<Employee> employees = new ArrayList<>();
    static{
        employees.add(new Employee("Anurag",22));
        employees.add(new Employee());
        employees.add(new Employee("anurag2",12));
    }


    public List<Employee> getAllEmployees(){
        return employees;
    }

    public Employee getOneEmp(){
        return employees.stream().findFirst().get();
    }

    public Employee addNewEmployee(Employee emp){
        employees.add(emp);
        return emp;
    }

    public String deleteEmployee(int id){
        for(int i=0;i<employees.size();i++){
            if(employees.get(i).getId()==id){
                employees.remove(i);
                return "200";
            }
        }
        return "404";
    }

    public Employee getEmployeeById(int id){
        return employees.stream()
                .filter(emp->emp.getId()==id)
                .findAny().orElse(null);
    }

    public Employee updateEmployee(int id , String name , int age){
        Employee emp = employees.stream()
                .filter(ep->ep.getId()==id)
                .findAny().orElse(null);
        if (emp==null) return emp;

        emp.setAge(age);
        emp.setName(name);
        return emp;
    }

}
