package com.example.simpleecomerce;

import com.example.simpleecomerce.controller.dto.ProductDto;
import com.example.simpleecomerce.entity.Product;
import com.example.simpleecomerce.repositories.ProductRepository;
import com.example.simpleecomerce.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class ProductTest {

    @Autowired
    private ProductService productService;

    @Autowired
    private  ProductRepository productRepository;

    @Test
    public void testGetAllProduct(){
        Pageable pageable =  Pageable.ofSize(1);
        Page<ProductDto> productDtos =  productService.getAllProduct(pageable);
        assertThat(productDtos.get().toList()).isNotEmpty();
    }

    @Test
    public void getProductByName(){
        List<Product> products =    productRepository.getProductByName("Iphone");
        assertThat(products).isNotEmpty();
    }

}
