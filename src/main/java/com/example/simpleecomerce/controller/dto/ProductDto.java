package com.example.simpleecomerce.controller.dto;


import lombok.Data;

import java.math.BigDecimal;
@Data
public class ProductDto {
    private Long id;
    private String productName;
    private String sku;
    private String productDescription;
    private String image;
    private BigDecimal price;
    private String note;
    private Boolean active;
}
