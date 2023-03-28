package com.example.simpleecomerce.repositories;

import com.example.simpleecomerce.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
    Set<Product> getAllByIdIsNotNull();
}
