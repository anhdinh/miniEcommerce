package com.example.simpleecomerce.exceptions;

import lombok.Data;

@Data
public class ProductNotFoundException extends RuntimeException {
    private String message = "the product not found";
    private int code;
}
