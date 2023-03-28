package com.example.simpleecomerce.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Shipping {
    private Long id;
    private String name;
    private String phone;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @Column(name ="shipping_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }
}
