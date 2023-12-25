package com.example.demo2priceanalyzer.analyzer.services;

import com.example.demo2priceanalyzer.analyzer.domain.models.Base;

import java.util.List;



public interface BaseService {
    void addBase(Base base);

    List<Base> findAll();

    Base save(Base base);
}
