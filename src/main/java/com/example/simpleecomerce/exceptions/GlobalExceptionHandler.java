package com.example.simpleecomerce.exceptions;


import org.jetbrains.annotations.NotNull;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler (ProductNotFoundException.class)
    public ResponseEntity<ResponseBase> handleException(@NotNull ProductNotFoundException e){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseBase(e.getMessage(),e.getCode()));
    }
}
