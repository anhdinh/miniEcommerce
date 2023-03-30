package com.example.simpleecomerce.service;

import com.example.simpleecomerce.controller.dto.ProductDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductService {
    Page<ProductDto> getAllProduct(Pageable pageable);

    ProductDto addNewProduct(ProductDto product);
}
