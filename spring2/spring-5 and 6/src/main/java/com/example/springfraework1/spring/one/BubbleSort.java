package com.example.springfraework1.spring.one;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Primary
public class BubbleSort implements Sort {
    public int[] sort(int[] array){
        Arrays.sort(array);
        return array;
    }
}
