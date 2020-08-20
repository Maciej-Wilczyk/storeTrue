package com.store.model;


import org.springframework.stereotype.Service;

import javax.persistence.*;

@Entity
@Table(name = "product")
@Service
public class Product {
    @Id
    @Column(name = "product_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int product_id;

    @Column(name = "product_name")
    private String product_name;

    @Column(name = "amount")
    private int amount;

    @Column(name = "price")
    private double price;



    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Product() {

    }


    public long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_nameP(String product_name) {
        this.product_name = product_name;
    }

}
