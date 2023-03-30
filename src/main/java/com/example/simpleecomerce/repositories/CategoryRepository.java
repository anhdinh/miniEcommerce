package com.example.simpleecomerce.repositories;

import com.example.simpleecomerce.entity.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.Set;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findCategoriesByCategoryName(String cateName);

    Iterable<Category> findCategoriesByActiveTrue();
}
