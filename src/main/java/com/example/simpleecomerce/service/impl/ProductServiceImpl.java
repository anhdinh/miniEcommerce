package com.example.simpleecomerce.service.impl;

import com.example.simpleecomerce.controller.dto.ProductDto;
import com.example.simpleecomerce.entity.Product;
import com.example.simpleecomerce.repositories.ProductRepository;
import com.example.simpleecomerce.service.ProductService;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    private final DozerBeanMapper mapper;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository, DozerBeanMapper dozerBeanMapper) {
        this.productRepository = productRepository;
        this.mapper = dozerBeanMapper;
    }

    public Page<ProductDto> getAllProduct(Pageable pageable){
       Page<Product> allProducts =  productRepository.getAllByIdIsNotNull(pageable);
       List<ProductDto> listProductDto =  new ArrayList<>();
       allProducts.get().toList().forEach(product -> {
           listProductDto.add(mapper.map(product,ProductDto.class));
       });
       Page<ProductDto> products =  new PageImpl<>(listProductDto,pageable,allProducts.getTotalElements());
       return products;
    }

    @Override
    public ProductDto addNewProduct(ProductDto product) {
        Product productEntity =  mapper.map(product,Product.class);
        productEntity =  productRepository.save(productEntity);
        return mapper.map(productEntity,ProductDto.class);
    }


}
