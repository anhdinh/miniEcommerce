package com.example.simpleecomerce.service.impl;

import com.example.simpleecomerce.entity.Category;
import com.example.simpleecomerce.entity.Product;
import com.example.simpleecomerce.repositories.CategoryRepository;
import com.example.simpleecomerce.repositories.ProductRepository;
import com.example.simpleecomerce.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    private final ProductRepository productRepository;

    @Autowired
    public CategoryServiceImpl(CategoryRepository categoryRepository, ProductRepository productRepository) {
        this.categoryRepository = categoryRepository;
        this.productRepository = productRepository;
    }

    public Set<Category> getAllCategoriesIsActive() {
        Set<Category> categories = new HashSet<>();
        Iterable<Category> categories1 = categoryRepository.findCategoriesByActiveTrue();
        categories1.forEach(category -> {
            categories.add(category);
        });
        return categories;
    }

    public Set<Product> getAllProductByCate() {
        Set<Product> listProduct = new HashSet<>();
        Iterable<Category> categories = categoryRepository.findCategoriesByActiveTrue();
        for (Category category : categories) {
            Set<Product> products = productRepository.getProductByCategory(category);
            listProduct.addAll(products);
        }
        return listProduct;
    }

}
