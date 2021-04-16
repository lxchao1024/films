package com.bhcj.edu.films.dao;

import com.bhcj.edu.films.entity.FilmCarts;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FilmCartDAO extends JpaRepository<FilmCarts, Integer> {
    List<FilmCarts> findAllByUid(int uid);
}
