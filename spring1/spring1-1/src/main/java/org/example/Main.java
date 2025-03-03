package org.example;

import com.google.gson.Gson;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,Integer> map = Map.of("one",1,"two",2,"three",3,"four",4);
        Gson gson = new Gson();
        System.out.println(gson.toJson(map));
    }
}

