package com.example.demo2priceanalyzer.analyzer.repos;


import com.example.demo2priceanalyzer.analyzer.domain.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Product findByName(String name);
}
