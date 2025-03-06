package com.restfulapi.restful_api_assignment.exceptions;


public class EmpNotFoundException extends RuntimeException{
    public EmpNotFoundException(String msg){
        super(msg);
    }
}
