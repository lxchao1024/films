package com.bhcj.edu.films.dao;

import com.bhcj.edu.films.entity.JotterArticle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JotterArticleDAO extends JpaRepository<JotterArticle, Integer> {
    JotterArticle findById(int id);
}
