package com.restfulapi.restful_api_assignment.exceptions;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDate;

@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(EmpNotFoundException.class)
    public ResponseEntity<ExceptionResponse> handleEmployeeNotFoundException(Exception ex, WebRequest request) throws Exception {

        ExceptionResponse expres = new ExceptionResponse(ex.getMessage(),404);
        ResponseEntity<ExceptionResponse> responseentity = new ResponseEntity<>(expres, HttpStatus.NOT_FOUND);
        return responseentity;
    }

    @Override
    public ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {
         ExceptionResponse expdet = new ExceptionResponse("validation errors", 400);
        return new ResponseEntity<>(expdet, HttpStatus.BAD_REQUEST);
    }


}
