package com.example.simpleecomerce.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.Set;

@Entity
@Data
@Table(name="\"order\"")
public class Order {

    private Long id;
    private String orderNumber;
    private Date orderDate;
    private BigDecimal tax;
    private String orderStatus;

    private Customer customer;

    private Shipping shipping;

    private Payment payment;


    private Set<OrderProductDetail> orderProductDetails;
    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @Column(name ="order_id")
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
    @ManyToOne
    @JoinColumn(name="shipping_id",referencedColumnName = "shipping_id")
    @JsonBackReference
    public Shipping getShipping() {
        return shipping;
    }

    @ManyToOne
    @JoinColumn(name="payment_id",referencedColumnName = "payment_id")
    @JsonBackReference
    public Payment getPayment() {
        return payment;
    }

    @OneToMany(mappedBy = "order")
    public Set<OrderProductDetail> getOrderProductDetails() {
        return orderProductDetails;
    }
}
