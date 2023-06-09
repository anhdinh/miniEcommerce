package com.example.simpleecomerce.repositories;

import com.example.simpleecomerce.entity.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository  extends CrudRepository<Category, Long> {
}
