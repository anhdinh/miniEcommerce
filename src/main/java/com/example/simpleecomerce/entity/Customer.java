package com.example.simpleecomerce.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class Customer {


    private Long id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    private String email;

    private String password;

    private Set<Order> orders;

    private Set<Address> addresses;

    @Id
    @Column(name = "customer_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    @OneToMany(mappedBy = "customer",targetEntity = Address.class)
    public Set<Address> getAddresses() {
        return addresses;
    }

    @OneToMany(mappedBy = "customer",targetEntity = Order.class)
    public Set<Order> getOrders() {
        return orders;
    }
}
