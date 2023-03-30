package com.example.simpleecomerce.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Address {

    private Long id;
    private String city;
    private String state;
    private String county;
    private String note;

    private Customer customer;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @Column(name="address_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }


    @ManyToOne
    @JoinColumn(name="customer_id",referencedColumnName = "customer_id")
    @JsonBackReference
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
