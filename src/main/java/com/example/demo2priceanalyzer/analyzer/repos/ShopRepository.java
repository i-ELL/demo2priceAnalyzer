package com.example.demo2priceanalyzer.analyzer.repos;

import com.example.demo2priceanalyzer.analyzer.domain.models.Shop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopRepository extends JpaRepository<Shop, Long> {
    Shop findByName(String name);
}
