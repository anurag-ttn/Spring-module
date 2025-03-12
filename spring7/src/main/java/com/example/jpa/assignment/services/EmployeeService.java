package com.example.jpa.assignment.services;

import com.example.jpa.assignment.entities.Employee;
import com.example.jpa.assignment.repositories.EmployeeRepository;
import org.antlr.v4.runtime.atn.EpsilonTransition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository emprepo;

    public Employee createNewEmployeeData(Employee emp){
        return emprepo.save(emp);
    }

    public List<Employee> createNewultipleEmployeeData(List<Employee> employees){
        return emprepo.saveAll(employees);
    }

    public Employee deleteOne(int id){
        Employee e = emprepo.findById(id).get();
        if(e!=null){
            emprepo.delete(e);
        }
        return e;
    }

    public Employee getbyid(int id){
        return emprepo.findById(id).get();
    }

    public List<Employee> getallemps() {
        return emprepo.findAll();
    }

    public long countemp() {
        return emprepo.count();
    }

    public List<Employee> getSortedInPages() {
        Pageable page = PageRequest.of(3,5,Sort.by(Sort.Direction.ASC,"age"));

        List<Employee> list =  emprepo.findAll(page).getContent();
        return list;
    }

    public List<Employee> getByName(String name) {
         return emprepo.findEmployeeByName(name);
    }

    public List<Employee> getEmpStarWithA() {
        return emprepo.findByNameStartsWith('a');
    }

    public List<Employee> getEmpAgeBetween(int a , int b){
        return emprepo.findByAgeBetween(a,b);
    }

    public Employee updateEmp(int id, String location) {
        Employee emp = emprepo.findById(id).get();
        if(emp==null) return null;
        emp.setLocation(location);
        return emprepo.save(emp);

    }
}
