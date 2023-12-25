package com.example.demo2priceanalyzer.analyzer.repos;


import com.example.demo2priceanalyzer.analyzer.domain.models.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Integer> {
}
