package com.store.controller;

import com.store.model.Magazine;
import com.store.model.Product;
import com.store.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/api")
public class ProductController {

    public ProductController() {
    }

    @Autowired
    ProductRepository productRepository;

    @GetMapping("/product")
    public List<Product> getMagazine()
    {
        return this.productRepository.findAll();
    }
}
