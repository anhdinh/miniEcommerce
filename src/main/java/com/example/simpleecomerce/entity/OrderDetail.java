package com.example.simpleecomerce.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class OrderDetail {
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal price;
    public Integer quantity;
    public BigDecimal total;

    @Id
    @Column(name ="order_detail_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }
}
