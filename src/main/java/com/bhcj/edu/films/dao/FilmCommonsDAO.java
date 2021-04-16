package com.bhcj.edu.films.dao;

import com.bhcj.edu.films.entity.FilmCommons;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FilmCommonsDAO extends JpaRepository<FilmCommons, Integer> {

    List<FilmCommons> findAllByFilmid(int filmId);

    FilmCommons findByUidAndFilmid(int uid, int filmId);
}
