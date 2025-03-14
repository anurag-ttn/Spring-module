package com.example.jpa2.services;

import com.example.jpa2.repos.PersonRepo;
import com.example.jpa2.single_table_strategy.Student;
import com.example.jpa2.single_table_strategy.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepo personRepo;

    public void method(){

        Student p1 = new Student();
        p1.setName("anurag");p1.setCourse("mca");p1.setStandard("16");
        Teacher p2 = new Teacher();
        p2.setLevel("masters");p2.setName("some teacher");p2.setQualification("phd");

        personRepo.save(p1);
        personRepo.save(p2);

    }
}
