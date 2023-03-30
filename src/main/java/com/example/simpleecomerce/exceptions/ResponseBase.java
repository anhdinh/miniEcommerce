package com.example.simpleecomerce.exceptions;

import lombok.Data;

@Data
public class ResponseBase {
    public String message;
    private int code;

    ResponseBase(String message,int code){
        this.message = message;
        this.code = code;
    }
}
