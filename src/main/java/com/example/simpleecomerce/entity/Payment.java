package com.example.simpleecomerce.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Payment {
    private Long id;
    private String name;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @Column(name ="payment_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }
}
