package com.example.simpleecomerce;

import com.example.simpleecomerce.entity.Product;
import com.example.simpleecomerce.repositories.CategoryRepository;
import com.example.simpleecomerce.repositories.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

@SpringBootTest
class SimpleEcomerceApplicationTests {

    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired

    private ProductRepository productRepository;

    @Test
    void contextLoads() {
    }

    @Transactional(rollbackFor = {Exception.class, Throwable.class})
    @Test
    public void add(){



    }



}
