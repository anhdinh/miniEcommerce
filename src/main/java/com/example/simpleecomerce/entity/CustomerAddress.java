package com.example.simpleecomerce.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class CustomerAddress {

    private Long id;
    private String city;
    private String state;
    private String county;
    private String note;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @Column(name="customer_address_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }
}
