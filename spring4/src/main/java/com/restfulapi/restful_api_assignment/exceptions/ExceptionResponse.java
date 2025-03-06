package com.restfulapi.restful_api_assignment.exceptions;

public class ExceptionResponse {
    private String message;
    private int errorcode;

    public ExceptionResponse(String msg , int error){
        this.message = msg;
        this.errorcode = error;
    }

    public String getMessage(){
        return message;
    }

    public int getErrorCode(){
        return errorcode;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
