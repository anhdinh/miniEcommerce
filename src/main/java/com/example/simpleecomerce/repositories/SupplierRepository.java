package com.example.simpleecomerce.repositories;

import com.example.simpleecomerce.entity.Category;
import org.springframework.data.repository.CrudRepository;

public interface SupplierRepository  extends CrudRepository<Category, Long> {
}
