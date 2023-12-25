package com.example.demo2priceanalyzer.analyzer.repos;

import java.util.Optional;


import com.example.demo2priceanalyzer.analyzer.domain.models.Base;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BaseRepository extends JpaRepository<Base, Long> {
    Optional<Base> findById(Long id);
}
