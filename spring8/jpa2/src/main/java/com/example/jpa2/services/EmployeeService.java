package com.example.jpa2.services;

import com.example.jpa2.entities.Employee;
import com.example.jpa2.repos.EmployeeRepo;
import com.example.jpa2.repos.PersonRepo;
import com.example.jpa2.single_table_strategy.Person;
import com.example.jpa2.single_table_strategy.Student;
import com.example.jpa2.single_table_strategy.Teacher;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;

    @Autowired
    private PersonRepo personRepo;

    public void method(){
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        Employee e4 = new Employee();
        Employee e5 = new Employee();
        Employee e6 = new Employee();
        Employee e7 = new Employee();
        Employee e8 = new Employee();
        Employee e9 = new Employee();
        Employee e10 = new Employee();

        e1.setFirstName("Anurag"); e1.setLastName("Kundu"); e1.setAge(25); e1.setSalary(30000L);
        e2.setFirstName("Harsh"); e2.setLastName("Verma"); e2.setAge(28); e2.setSalary(35000L);
        e3.setFirstName("Priya"); e3.setLastName("Sharma"); e3.setAge(26); e3.setSalary(40000L);
        e4.setFirstName("Amit"); e4.setLastName("Singh"); e4.setAge(30); e4.setSalary(45000L);
        e5.setFirstName("Neha"); e5.setLastName("Gupta"); e5.setAge(27); e5.setSalary(32000L);
        e6.setFirstName("Ravi"); e6.setLastName("Yadav"); e6.setAge(29); e6.setSalary(50000L);
        e7.setFirstName("Sonia"); e7.setLastName("Singh"); e7.setAge(24); e7.setSalary(28000L);
        e8.setFirstName("Manoj"); e8.setLastName("Tripathi"); e8.setAge(31); e8.setSalary(52000L);
        e9.setFirstName("Kavita"); e9.setLastName("Mehra"); e9.setAge(26); e9.setSalary(31000L);
        e10.setFirstName("Rahul"); e10.setLastName("Mishra"); e10.setAge(32); e10.setSalary(55000L);

        List<Employee> list = Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10);
        employeeRepo.saveAll(list);

    }

    public List<Object[]> getAllEmployeeNamesBasedOnAgeAndSalary(){
        return employeeRepo.getAllEmployeeNamesBasedOnAgeAndSalary(Sort.by(new Sort.Order(Sort.Direction.ASC,"age"),new Sort.Order(Sort.Direction.DESC,"salary")));
    }

    @Transactional
    public void updateSalary(long salary){
        employeeRepo.updateSalaryByMinimum(salary);
    }

    @Transactional
    public int deleteEmployeeMinSal(){
        long min =  employeeRepo.findAllWithMinSalary();
        return employeeRepo.deleteEmployeeWithMinimumSalary(min);
    }


    public List<Object[]> findWithLastName(String lastname) {
        return employeeRepo.findAllWithThisLastName(lastname);
    }

    public int deleteWithAgegreater(int age) {
        return employeeRepo.deleteEmployeWithAgeGreaterThan(age);
    }
}
