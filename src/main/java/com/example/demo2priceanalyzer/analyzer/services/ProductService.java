package com.example.demo2priceanalyzer.analyzer.services;

import com.example.demo2priceanalyzer.analyzer.domain.models.Product;

import java.util.List;


public interface ProductService {

    boolean addProduct(Product product);

    List<Product> findAll();

    Product save(Product product);
}
