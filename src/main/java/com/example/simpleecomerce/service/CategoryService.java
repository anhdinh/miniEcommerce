package com.example.simpleecomerce.service;


import com.example.simpleecomerce.entity.Category;
import com.example.simpleecomerce.entity.Product;

import java.util.List;
import java.util.Set;

public interface CategoryService {
    Set<Category> getAllCategoriesIsActive();
    public Set<Product> getAllProductByCate();
}
