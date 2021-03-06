package com.pfizer.restapi.model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Cart {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private Date creationDate;
    @ManyToOne
    @JoinColumn(name= "customer_id")
    private Customer customer;
    @OneToMany(mappedBy = "cart")
    private List<CartProduct> cartProducts = new ArrayList<>();
}
