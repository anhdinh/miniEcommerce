package com.example.simpleecomerce.repositories;

import com.example.simpleecomerce.entity.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment,Long> {
}
