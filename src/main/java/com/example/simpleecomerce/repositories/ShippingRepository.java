package com.example.simpleecomerce.repositories;

import com.example.simpleecomerce.entity.Shipping;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShippingRepository extends CrudRepository<Shipping,Long> {
}
