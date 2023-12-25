package com.example.demo2priceanalyzer.analyzer.services;

import com.example.demo2priceanalyzer.analyzer.domain.models.Shop;

import java.util.List;



public interface ShopService {

    boolean addShop(Shop shop);

    List<Shop> findAll();
    Shop save(Shop shop);
}