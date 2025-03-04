package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class GetStudents {
    @RequestMapping("/get-courses")
    public List<Student> getallstudents(){
        return Arrays.asList(
                new Student(1,"java"),
                new Student(2,"python"),
                new Student(3,"cpp")
        );
    }
}
