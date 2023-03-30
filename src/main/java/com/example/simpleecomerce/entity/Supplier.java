package com.example.simpleecomerce.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class Supplier {

    private Long id;
    @Column(name = "supplier_name")
    private String supplierName;
    private String logo;

    private Set<Product> products;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @Column(name ="supplier_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    @OneToMany(mappedBy = "supplier",targetEntity = Product.class)
    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}
