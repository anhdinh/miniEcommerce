package com.example.simpleecomerce.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data
@Table(name="\"order_detail\"")
public class OrderProductDetail {
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal price;
    public Integer quantity;
    public BigDecimal total;
    public Product product;


    private Order order;

    @Id
    @Column(name ="order_detail_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }
    @ManyToOne
    @JoinColumn(name = "order_id", referencedColumnName = "order_id")
    public Order getOrder() {
        return order;
    }

    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "product_id")
    public Product getProduct() {
        return product;
    }
}
