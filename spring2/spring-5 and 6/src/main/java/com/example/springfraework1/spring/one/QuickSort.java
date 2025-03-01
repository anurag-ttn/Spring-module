package com.example.springfraework1.spring.one;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class QuickSort implements Sort{
    public int[] sort(int[] array){
        Arrays.sort(array);
        return array;
    }
}
