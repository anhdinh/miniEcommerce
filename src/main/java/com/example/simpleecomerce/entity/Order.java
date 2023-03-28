package com.example.simpleecomerce.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Data
public class Order {

    private Long id;
    private String orderNumber;
    private Date orderDate;
    private BigDecimal tax;
    private String orderStatus;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @Column(name ="order_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }
}
