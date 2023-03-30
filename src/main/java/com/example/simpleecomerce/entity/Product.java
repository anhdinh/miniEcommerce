package com.example.simpleecomerce.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

@Entity
@Data
@EqualsAndHashCode
public class Product {
    private Long id;
    @Column(name = "product_name")
    private String productName;
    private String sku;
    @Column(name = "product_description")
    private String productDescription;
    private String image;
    private BigDecimal price;
    private String note;
    private Boolean active = true;

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
