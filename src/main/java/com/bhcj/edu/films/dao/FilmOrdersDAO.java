package com.bhcj.edu.films.dao;

import com.bhcj.edu.films.entity.FilmOrders;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FilmOrdersDAO extends JpaRepository<FilmOrders, Integer> {
    List<FilmOrders> findAllByUid(int uid);
}
