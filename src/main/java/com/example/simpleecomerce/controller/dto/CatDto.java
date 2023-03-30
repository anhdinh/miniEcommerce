package com.example.simpleecomerce.controller.dto;

import com.example.simpleecomerce.entity.Category;
import com.example.simpleecomerce.entity.Product;
import lombok.Data;

import java.util.Set;

@Data
public class CatDto {
    Set<Category> categories;
    Set<Product> products;
}
