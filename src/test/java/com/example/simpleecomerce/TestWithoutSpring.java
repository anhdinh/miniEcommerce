package com.example.simpleecomerce;

import com.example.simpleecomerce.controller.dto.ProductDto;
import com.example.simpleecomerce.entity.Product;
import org.dozer.DozerBeanMapper;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

public class TestWithoutSpring {

    @Test
    public void test() {
        List<Product> products = List.of(
                new Product(),
                new Product(),
                new Product(),
                new Product(),
                new Product()
        );
        List<ProductDto> list =   products.stream().map(product ->new DozerBeanMapper().map(product,ProductDto.class)).collect(Collectors.toList());
        list.forEach(System.out::println);

    }
}
