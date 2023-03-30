package com.example.simpleecomerce.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Set;

@Entity
@Data
@Table(name = "category")
@EqualsAndHashCode
public class Category {

    private Long id;
    @Column(name="category_name")
    private String categoryName;
    private String description;
    private String image;
    private boolean active;



    private Set<Product> products;


    public void setId(Long id) {
        this.id = id;
    }
    @Id
    @Column(name="category_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    @OneToMany(mappedBy = "category")
    public Set<Product> getProducts() {
        return products;
    }

}
