package com.example.springfraework1.spring.one;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class BinarySearch {

    public Sort sortalgo;

    @Autowired
    public BinarySearch(Sort algo){
        sortalgo=algo;
    }

    public int search(int[] array){
        System.out.println(sortalgo);
        sortalgo.sort(array);
        return 5;
    }
}
