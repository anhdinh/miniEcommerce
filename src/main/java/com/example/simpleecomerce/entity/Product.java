package com.example.simpleecomerce.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Product {
    private Long id;
    @Column(name = "product_name")
    private String productName;
    private String sku;

    public void setId(Long id) {
        this.id = id;
    }


    private Category category;


    private Supplier supplier;

    @Id
    @Column(name ="product_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonBackReference
    public Long getId() {
        return id;
    }
    @ManyToOne
    @JoinColumn(name="category_id",referencedColumnName = "category_id")
    @JsonBackReference
    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @ManyToOne
    @JoinColumn(name="supplier_id",referencedColumnName = "supplier_id")
    @JsonBackReference
    public Supplier getSupplier() {
        return supplier;
    }


    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
}
