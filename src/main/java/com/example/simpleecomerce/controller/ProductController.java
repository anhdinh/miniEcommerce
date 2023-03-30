package com.example.simpleecomerce.controller;

import com.example.simpleecomerce.controller.dto.CustomPageDto;
import com.example.simpleecomerce.controller.dto.ProductDto;
import com.example.simpleecomerce.service.ProductService;
import com.example.simpleecomerce.utilites.PageSetting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {

    public final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/all/{page}")
    public CustomPageDto<ProductDto> getAllProduct(@PathVariable Optional<Integer> page) {
        Pageable pageable = PageRequest.of(page.orElse(0), PageSetting.PAGE_SIZE);
        return new CustomPageDto<>(productService.getAllProduct(pageable));
    }

    @GetMapping("/all")
    public CustomPageDto<ProductDto> getAllProduct() {
        Pageable pageable = PageRequest.of(0, PageSetting.PAGE_SIZE);
        return new CustomPageDto<>(productService.getAllProduct(pageable));
    }

    @PostMapping("/add")
    public ResponseEntity<ProductDto> addProduct(@RequestBody ProductDto product){
       ProductDto newProduct =  productService.addNewProduct(product);
        return new ResponseEntity<>(newProduct, HttpStatus.CREATED);
    }
}
